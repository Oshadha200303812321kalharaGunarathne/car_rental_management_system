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
public class PaymentEntity{
    @Id
    private String id;
    private String bookingId;
    private String paymentMethod;
    private String status;
    private double amount;
    private LocalDate paymentDate;
}
