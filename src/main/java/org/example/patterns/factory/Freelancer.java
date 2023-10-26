package org.example.patterns.factory;

public class Freelancer extends Employee{

    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Worker; Avarage salary %.2f rub.", surName, name, calculateSalary());
    }

}
