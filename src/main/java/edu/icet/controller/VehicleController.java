package edu.icet.controller;

import edu.icet.model.dto.Vehicle;
import edu.icet.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    public void save(@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
    }
}
