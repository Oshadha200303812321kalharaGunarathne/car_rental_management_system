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
public class CustomerEntity {
    @Id
    private String custId;
    private String custName;
    private String nic;
    private LocalDate dob;
    private String address;
    private String email;
    private String phoneNo;
}

