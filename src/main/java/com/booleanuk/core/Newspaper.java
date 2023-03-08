package com.booleanuk.core;

public class Newspaper {
    String title;

    boolean onLoan = false;

    public Newspaper(String title) {
        this.title = title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public String checkIn() {
        return "newspapers are not available for loan";
    }

    public String checkOut() {
        return "newspapers are not available for loan";
    }
}
