package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phoneNo;
}
