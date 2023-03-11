package com.mojafa;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private Pet[] pets;
    private Address address;

    private Car[] cars;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", pets=" + Arrays.toString(pets) +
                ", address=" + address +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && getGender() == person.getGender() && Arrays.equals(getPets(), person.getPets()) && Objects.equals(getAddress(), person.getAddress()) && Arrays.equals(getCars(), person.getCars());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getLastName(), getGender(), getAge(), getAddress());
        result = 31 * result + Arrays.hashCode(getPets());
        result = 31 * result + Arrays.hashCode(getCars());
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Person(String firstName, String lastName, Gender gender, int age, Pet[] pets, Address address, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.pets = pets;
        this.address = address;
        this.cars = cars;
    }
}
