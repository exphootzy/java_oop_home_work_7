package org.example.patterns.observer;

public class MiddleDeveloper implements Observer {

    private String name;

    private int salary = 70000;

    private String searchingJob;

    public MiddleDeveloper(String name, String searchingJob) {
        this.name = name;
        this.searchingJob = searchingJob;
    }


    @Override
    public void receiveOffer(String nameCompany, int Salary, Vacancy vacancy) {
        if (this.salary <= salary && this.searchingJob.equals(vacancy.getName())) {
            System.out.printf("Developer %s: I need this job! (company: %s; salary: %d, vacancy: %s)\n", name, nameCompany, salary, vacancy);
            this.salary = salary;

        }
        else  {
            System.out.printf("Developer %s: I'll find a better job! (company: %s; salary: %d)\n", name, nameCompany, salary);
        }
    }

}
