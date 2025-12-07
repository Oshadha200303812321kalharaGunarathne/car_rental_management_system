package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String empID;
    private String name;
    private String nic;
    private LocalDate dob;
    private String address;
    private String email;
    private double salary;
    private String phoneNo;
    private String jobRole;
}
