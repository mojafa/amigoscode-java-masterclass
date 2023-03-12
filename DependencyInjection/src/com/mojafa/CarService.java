package com.mojafa;

public class CarService {
    private CarDAO carDAO;
    private EmailService emailService;

    private MOTService motService;

    public CarService(CarDAO carDAO, EmailService emailService, MOTService motService) {
        //added the field to a constructir
        this.carDAO = carDAO;
        this.emailService = emailService;
    }
}
