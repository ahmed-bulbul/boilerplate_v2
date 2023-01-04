package com.bulbul.boilerplate.streamapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMap {

    public static void main(String[] args) throws JsonProcessingException {

        List<String> projects = Arrays.asList("HRMS","POS","Ecom");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bulbul","Ahmed",120000.0,"Software Engineer",projects));
        employees.add(new Employee("Tamim","Iqbal",120000.0,"Player",projects));
        employees.add(new Employee("Sakib","Ahmed",120000.0,"Software Engineer",projects));
        employees.add(new Employee("Rakib","Ahmed",120440.0,"HR",projects));


        //Grouping By
        Map<String,List<Employee>> grpEmp = groupByJobTitleByStreamAPI(employees);
        grpEmp.forEach((key, value) ->{
            System.out.println(key + " "+value);
        });
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(grpEmp);
        System.out.println(json);

        //Get Avg Salary
        System.out.println(calculateAverage(employees));

    }

    public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        Map<String, List<Employee>> resultMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<>());
            employeeSubList.add(employee);
            resultMap.put(employee.getTitle(), employeeSubList);
        }
        return resultMap;
    }

    public static Map<String, List<Employee>> groupByJobTitleByStreamAPI(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getTitle));
    }

    public static double calculateAverage(List<Employee> employeeList) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            sum += employee.getSalary();
            count++;
        }
        return (double) sum / count;
    }

    public static double calculateAverageStreamAPI(List<Employee> employeeList){
        return employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0); // ByDefault return 0.0

    }
}
