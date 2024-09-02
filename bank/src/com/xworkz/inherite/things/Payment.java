package com.xworkz.inherite.things;

public class Payment {
    public String method;
    public double amount;
    public Booking booking;

    public Payment(String method, double amount, Booking booking) {
        this.method = method;
        this.amount = amount;
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Payment:method=" + method + "," +
                "amount=" + amount +","+ "booking=" + booking ;
    }
}
