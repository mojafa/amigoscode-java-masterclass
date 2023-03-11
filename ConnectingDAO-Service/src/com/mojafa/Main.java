package com.mojafa;

import com.mojafa.car.Car;
import com.mojafa.car.CarService;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Toyota",
                "Camry",
                "12345678901234567",
                "1234567",
                10000.00,
                2019,
                "Black",
        );

        CarService service = new CarService();
        service.registerCar(car);
        System.out.println(Arrays.toString(service.getCars()));
//        for (Car c : cars) {
//            System.out.println(c);
//        }

    }
}