package org.example;

public class Main{
    public static void main(String[] args) {
        OverloadedMethods calculator = new OverloadedMethods();
        System.out.println("Sum of two integers: "+ calculator.add(5,10));
        System.out.println("Sum of three integers: "+ calculator.add(5,10,3));
        System.out.println("Sum of two doubles: "+ calculator.add(5.6,10.96));
//        System.out.println();
    }
}
