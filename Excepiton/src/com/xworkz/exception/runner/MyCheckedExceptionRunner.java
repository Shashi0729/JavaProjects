package com.xworkz.exception.runner;

public class MyCheckedExceptionRunner {
    public static void main(String[] args) {
        
        try {
            MyCheckedException.riskyMethod(); 
        } catch (MyCheckedException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }

}
