package com.mojafa.car;

public class CarService {
    CarDAO dao = new CarDAO();
    public CarService() {
        this.dao = new CarDAO();
    }
    public int registerCar(Car car) {
//
//        return dao.insertCar(car);
        //check if car is not null
        //check if car is not already registered
        //check if car has a valid VIN
        //check if car has a valid license plate
        //check if car has a valid model
        //check if car has a valid make
        //price is not null
        //price is not negative
        //price is not zero
        CarDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars() {
       return CarDAO.selectAllCars();
    }
}
