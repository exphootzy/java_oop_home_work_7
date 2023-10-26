package org.example.patterns.factory;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    static Random random = new Random();
    static Employee generateEmployee(EmployeeType employeeType) {

        String[] names = new String[]{"Anasteisha", "Grigoryy", "Ayse", "Woody", "Ben"};
        String[] surnames = new String[]{"Kudrow", "Demir", "Smit", "Black", "Bors"};
        int typeIndex = random.nextInt(2);
        int salary = random.nextInt(200, 500);
        int index = random.nextInt(100, 150);
        return switch (employeeType) {
            case Freelancer -> new Freelancer(names[random.nextInt(5)], surnames[random.nextInt(5)], salary);
            case Worker -> new Worker(names[random.nextInt(5)], surnames[random.nextInt(5)], salary + index);
        };
    }


    static  Employee generateEmployee(){
        int typeIndex = random.nextInt(2);
        return switch (typeIndex) {
            case 0 -> generateEmployee(EmployeeType.Freelancer);
            case 1 -> generateEmployee(EmployeeType.Worker);
            default -> null;
        };
    }

    static ArrayList<Employee> generateEmployees(int count){
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employees.add(generateEmployee());
        }
        return employees;
    }

    public static void main(String[] args) {
        for (Employee e : generateEmployees(20)){
            System.out.println(e);
        }
    }


}
