package com.bulbul.boilerplate.common.loader;

import com.digigate.engineeringmanagement.common.constant.ApplicationConstant;
import com.digigate.engineeringmanagement.common.constant.ErrorId;
import com.digigate.engineeringmanagement.common.exception.EngineeringManagementServerException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Default access right loader
 *
 * @author Pranoy Das
 */
@Component
public class DefaultAccessRightLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultAccessRightLoader.class);
    public static Map<String, String> DEFAULT_ACCESS_MAP = new HashMap<>();

    @PostConstruct
    private static void loadDefaultAccessRight() {
        load();
    }

    private static void load() {
        try {
            File jsonFile = new ClassPathResource("api_map.json").getFile();
            DEFAULT_ACCESS_MAP = new ObjectMapper().readValue(jsonFile, Map.class);
        } catch (IOException ex) {
            LOGGER.error("File path not found. Exception: {}", ex.getMessage());
            throw new EngineeringManagementServerException(
                    ErrorId.FILE_PATH_NOT_FOUND, HttpStatus.NOT_FOUND, MDC.get(ApplicationConstant.TRACE_ID)
            );
        }
    }
}
