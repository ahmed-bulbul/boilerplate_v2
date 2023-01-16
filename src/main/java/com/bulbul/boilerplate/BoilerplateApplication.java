package com.bulbul.boilerplate;

import com.bulbul.boilerplate.learning.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class BoilerplateApplication {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(
                new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1", "Project 2"))
        );

        employees.add(
                new Employee("Nikhil", "Gupta", 6000.0, List.of("Project 1", "Project 3"))
        );

        employees.add(
                new Employee("Shivam", "Kumar", 5500.0, List.of("Project 3", "Project 4"))
        );

    }


    public static void main(String[] args) {
        SpringApplication.run(BoilerplateApplication.class, args);
//
//        //foreach
//        employees.stream()
//        .forEach(employee -> System.out.println(employee));
//
//
//        //map
//        //collect
//        Set<Employee> increasedSal =
//                employees.stream()
//                        .map(employee -> new Employee(
//                                employee.getFirstName(),
//                                employee.getLastName(),
//                                employee.getSalary() * 1.10,
//                                employee.getProjects()
//                        ))
//                        .collect(Collectors.toSet());
//        System.out.println(increasedSal);
//
//
//        //filter
//        //findFirst
//        List<Employee> filterEmployee =
//                employees
//                        .stream()
//                        .filter(employee -> employee.getSalary() > 5000.0)
//                        .map(employee -> new Employee(
//                                employee.getFirstName(),
//                                employee.getLastName(),
//                                employee.getSalary() * 1.10,
//                                employee.getProjects()
//                        ))
//                        .collect(Collectors.toList());
//
//        System.out.println(filterEmployee);
//
//
//        Employee firstEmployee =
//                employees
//                        .stream()
//                        .filter(employee -> employee.getSalary() > 7000.0)
//                        .map(employee -> new Employee(
//                                employee.getFirstName(),
//                                employee.getLastName(),
//                                employee.getSalary() * 1.10,
//                                employee.getProjects()
//                        ))
//                        .findFirst()
//                        .orElse(null);
//        System.out.println(firstEmployee);
//
//
//        //flatMap
//        String projects =
//                employees
//                        .stream()
//                        .map(employee -> employee.getProjects())
//                        .flatMap(strings -> strings.stream())
//                        .collect(Collectors.joining(","));
//        System.out.println(projects);
//
//        //short Circuit operations
//        List<Employee> shortCircuit =
//                employees
//                        .stream()
//                        .skip(1)
//                        .limit(1)
//                        .collect(Collectors.toList());
//        System.out.println(shortCircuit);
//
//
//        //Finite Data
//        Stream.generate(Math::random)
//                .limit(5)
//                .forEach(value -> System.out.println(value));
//
//        //sorting
//        List<Employee> sortedEmployees =
//                employees
//                        .stream()
//                        .sorted((o1, o2) -> o1.getFirstName()
//                                .compareToIgnoreCase(o2.getFirstName()))
//                        .collect(Collectors.toList());
//        System.out.println(sortedEmployees);
//
//
//        //min or max
//        employees
//                .stream()
//                .max(Comparator.comparing(Employee::getSalary))
//                .orElseThrow(NoSuchElementException::new);
//
//        //reduce
//        Double totalSal =
//                employees
//                        .stream()
//                        .map(employee -> employee.getSalary())
//                        .reduce(0.0, Double::sum);
//        System.out.println(totalSal);

    }
}


