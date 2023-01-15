package com.bulbul.boilerplate.learning.streamapi;

import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private Double salary;
    private String title;
    private List<String> projects;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", title=" + title +
                ", projects=" + projects +
                '}';
    }

    public Employee(String firstName, String lastName, Double salary,String title, List<String> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.title=title;
        this.projects = projects;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
