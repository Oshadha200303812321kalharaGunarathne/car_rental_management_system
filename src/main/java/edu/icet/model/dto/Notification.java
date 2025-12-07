package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Notification {
    private String notificationID;
    private String customerID;
    private String bookingID;
    private LocalDate date;
    private String message;
}
