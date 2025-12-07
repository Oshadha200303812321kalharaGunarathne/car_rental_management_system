package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Maintaince {
    private String maintainceID;
    private String vehicleID;
    private String description;
    private LocalDate maintainceDate;
    private String status;
}
