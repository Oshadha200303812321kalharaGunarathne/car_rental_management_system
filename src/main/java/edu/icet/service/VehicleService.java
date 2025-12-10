package edu.icet.service;

import edu.icet.Repository.VehicleRepository;
import edu.icet.model.dto.Vehicle;
import edu.icet.model.entity.VehicleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public void save(Vehicle vehicle){
        vehicleRepository.save(new VehicleEntity(
                vehicle.getVehicleID(),
                vehicle.getRegistrationNo(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getFuelType(),
                vehicle.getType(),
                vehicle.getAvailabilityStatus(),
                vehicle.getSeatingCapacity(),
                vehicle.getDailyRentalPrice()
        ));
    }
}
