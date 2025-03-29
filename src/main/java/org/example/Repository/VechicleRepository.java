package org.example.Repository;

import org.example.dto.Vehicle.Vehicle;
import org.example.enums.VehicleType;

import java.util.List;

public interface VechicleRepository {
    public Vehicle getVehicleById(String id);

    public List<Vehicle> getAvaiableVehicles(VehicleType vehicleType);

    public void addVehicle(Vehicle vehicle);

    public void removeVehicle(Vehicle vehicle);
}
