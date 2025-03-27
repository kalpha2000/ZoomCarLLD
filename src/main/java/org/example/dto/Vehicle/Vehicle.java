package org.example.dto.Vehicle;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.example.enums.VechicleStatus;
import org.example.enums.VehicleType;

import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Vehicle {
    String id;
    String regNum;
    String adminId;
    VehicleType vehicleType;
    VechicleStatus vehicleStatus;
}
