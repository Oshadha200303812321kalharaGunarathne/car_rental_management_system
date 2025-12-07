package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Booking {
    private String bookingID;
    private String customerID;
    private String vehicleID;
    private String description;
    private String bookingStatus;
    private double amount;
    private LocalDate pickupDate;
    private LocalDate returnDate;
}
