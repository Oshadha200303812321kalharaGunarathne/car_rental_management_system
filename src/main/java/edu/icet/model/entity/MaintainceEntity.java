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
public class MaintainceEntity {
    @Id
    private String maintainceID;
    private String vehicleID;
    private String description;
    private LocalDate maintainceDate;
    private String status;
}
