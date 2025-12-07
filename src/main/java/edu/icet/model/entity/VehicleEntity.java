package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class VehicleEntity {
    @Id
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

