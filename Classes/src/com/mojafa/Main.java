package com.mojafa;

public class Main {
    public static void main(String[] args) {

        Person alex = new Person(
                "Alex",
                "Smith",
                Gender.MALE,
                new Address("123 Main St", "New York", "NY", "10001", "USA"),
                new Pet("Fido", "Dog", 3),
                new Pet("Garfield", "Cat", 5),
                new Car(CarBrand.ALFA_ROMEO, "Camry", 2015, "Red", 30000.14, 1000, "123456789", "ABC123", "NY", "USA"),
                );

    }
}