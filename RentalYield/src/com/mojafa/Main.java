package com.mojafa;

public class Main {
    public static void main(String[] args) {
        double result = rentalIncome(1300.0, 250000.0);
        System.out.println(result);
    }
    private static double rentalIncome(double rentPrice, double propertyPrice) {
        double yearlyRent = rentPrice * 12.0;
        return (yearlyRent / propertyPrice) * 100.0

    }
}