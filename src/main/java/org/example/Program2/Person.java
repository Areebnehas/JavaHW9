package org.example.Program2;

public class Person {
    private String name;
    private int age;
    private Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("age:" + age);
        job.displayJobInfo();
    }
}

