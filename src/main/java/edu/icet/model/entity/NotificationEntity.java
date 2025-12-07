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
public class NotificationEntity {
    @Id
    private String notificationID;
    private String customerID;
    private String bookingID;
    private LocalDate date;
    private String message;
}

