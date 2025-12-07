package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {
    private String id;
    private String bookingId;
    private String paymentMethod;
    private String status;
    private double amount;
    private LocalDate paymentDate;
}
