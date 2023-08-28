package org.example.Program2;

public class MainClass {
    public static void main(String[] args) {
        Job SoftwareEngineer = new Job("soft engineer", 80000);
        Person person = new Person("alice" , 30 , SoftwareEngineer);
        person.displayInfo();
    }
}
