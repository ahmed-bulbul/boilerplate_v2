package com.bulbul.boilerplate.common.interceptor;

import com.bulbul.boilerplate.common.authentication.security.jwt.JwtUtils;
import com.bulbul.boilerplate.common.constant.ApplicationConstant;
import com.bulbul.boilerplate.common.constant.ErrorId;
import com.bulbul.boilerplate.common.entity.AccessRight;
import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.exception.ApplicationServerException;
import com.bulbul.boilerplate.common.service.UserService;
import com.bulbul.boilerplate.common.utils.Helper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Request Handling Interceptor
 *
 * @author Bulbul Ahmed
 */
@Component
public class RequestHandlingInterceptor implements HandlerInterceptor {

    private static final String SLASH = "/";
    private final UserService userService;
    private final JwtUtils jwtUtils;
    private final Helper helper;
    /**
     * Autowired constructor
     *
     * @param userService {@link UserService}
     * @param jwtUtils    {@link JwtUtils}
     * @param helper      {@link Helper}
     */
    @Autowired
    public RequestHandlingInterceptor(@Lazy UserService userService, JwtUtils jwtUtils, Helper helper) {
        this.userService = userService;
        this.jwtUtils = jwtUtils;
        this.helper = helper;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        MDC.put(ApplicationConstant.TRACE_ID, UUID.randomUUID().toString());
        String requestURI = helper.getRequestUri();

        if (!includesInWhiteListedUrls(requestURI)) {
            String jwt = helper.parseJwt();
            String username = jwtUtils.getUserNameFromJwtToken(jwt);

            Map pathVariables =(Map) request.getAttribute(
                    HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
            String methodType = request.getMethod();

            User user = userService.findByUsername(username);
            validateUserAccessPermission(user, requestURI, pathVariables, methodType);
        }

        return true;
    }



    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

    private boolean includesInWhiteListedUrls(String path) {
        return Arrays.stream(ApplicationConstant.WHITE_LIST_URLS)
                .anyMatch(path::startsWith);
    }

    private void validateUserAccessPermission(User user, String requestURI, Map pathVariables, String methodType) {

        Set<Role> userRoles = user.getRoles();
        for (Role role : userRoles) {
            if (Objects.equals(role.getId(), ApplicationConstant.SUPER_ADMIN_ROLE_ID)) {
                return;
            }
        }

        String[] requestURIArr = requestURI.split(SLASH);
        int length = pathVariables.size();
        int requestURIArrLastIndex = requestURIArr.length - 1;

        while (length > 0 && requestURIArr.length > length) {
            requestURIArr = ArrayUtils.remove(requestURIArr, requestURIArrLastIndex);
            length--;
            requestURIArrLastIndex--;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : requestURIArr) {
            sb.append(s).append(SLASH);
        }
        sb.append(methodType.toLowerCase());
        Set<Integer> accessRightSet;
        for (Role role : userRoles) {
            if (Objects.equals(role.getId(), ApplicationConstant.SUPER_ADMIN_ROLE_ID)) {
                return;
            }
        }
//        if (ApplicationConstant.roleMap.containsKey(role.getId())) {
//            accessRightSet = ApplicationConstant.roleMap.get(role.getId());
//        } else {
//            accessRightSet = user.getRole().getAccessRightSet().stream()
//                    .map(AccessRight::getId)
//                    .collect(Collectors.toSet());
//            ApplicationConstant.roleMap.put(role.getId(), accessRightSet);
//        }
//        Integer accessRightId = NumberUtil.convertToInteger(
//                DefaultAccessRightLoader.DEFAULT_ACCESS_MAP.get(sb.toString()),
//                ApplicationConstant.DEFAULT_PERMISSION_ID
//        );

//        if (Objects.equals(accessRightId, ApplicationConstant.DEFAULT_PERMISSION_ID)) {
//            return;
//        }
//
//        if (!accessRightSet.contains(accessRightId)) {
//            throw new ApplicationServerException(
//                    ErrorId.INVALID_ACCESS_PERMISSION, HttpStatus.BAD_REQUEST, MDC.get(ApplicationConstant.TRACE_ID)
//            );
//        }

    }
}
