package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class BookingEntity {
    @Id
    private String bookingID;
    private String customerID;
    private String vehicleID;
    private String description;
    private String bookingStatus;
    private double amount;
    private LocalDate pickupDate;
    private LocalDate returnDate;
}
