package com.xworks.task.service;

import java.time.LocalDate;
import java.time.LocalDateTime;


	

public abstract class AbstractClass {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private boolean isActive;
    private LocalDate createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    public AbstractClass(int id, String name, double price, int quantity, String description, boolean isActive, LocalDate createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void updateStatus(boolean newStatus) {
        this.isActive = newStatus;
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void printWelcome() {
        System.out.println("Welcome");
    }

    public static void printGoodbye() {
        System.out.println("Goodbye");
    }

    public abstract void calculateDiscount();
    public abstract void calculateTax();
    public abstract void calculateTotal();
}



