package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private String custId;
    private String custName;
    private String nic;
    private LocalDate dob;
    private String address;
    private String email;
    private String phoneNo;
}
