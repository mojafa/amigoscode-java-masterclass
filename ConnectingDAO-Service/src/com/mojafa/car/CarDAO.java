package com.mojafa.car;

public class CarDAO {
    private static Car[] cars;

    private static int nextAvailableSlot = 0;

    private static final int CAPACITY = 5;


    public CarDAO() {
        //connect to database
    }
    public static int saveCar(Car car) {
        if (nextAvailableSlot +1 >= CAPACITY){
            //grow db
        }
        cars[nextAvailableSlot] = car;
        nextAvailableSlot++;
        //insert car into database
        return 1;
    }
    public static Car[] selectAllCars() {
        //select all cars from database
        return cars;
    }
}
