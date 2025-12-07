package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vehicle {
    private String vehicleID;
    private String registrationNo;
    private String type;
    private String model;
    private String brand;
    private String fuelType;
    private String seatingCapacity;
    private String availabilityStatus;
    private double dailyRentalPrice;
}
