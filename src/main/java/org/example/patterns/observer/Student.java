package org.example.patterns.observer;

public class Student implements Observer {

    private String name;
    private int salary = 2000;
    private String searchingJob;


    public Student(String name, String searchingJob) {
        this.name = name;
        this.searchingJob = searchingJob;
    }

    Publisher jobAgency = new JobAgency();



    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {

        if (this.salary <= salary && this.searchingJob.equals(vacancy.getName())) {
            System.out.printf("Student %s: I need this job! (company: %s; salary: %d, vacancy: %s)\n", name, nameCompany, salary, vacancy);
            this.salary = salary;


        }
        else  {
            System.out.printf("Student %s: I'll find a better job! (company: %s; salary: %d)\n", name, nameCompany, salary);
        }
    }

}
