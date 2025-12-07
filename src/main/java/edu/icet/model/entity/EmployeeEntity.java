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
public class EmployeeEntity {
    @Id
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
