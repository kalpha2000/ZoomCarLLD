package org.example.dto;

import lombok.Builder;
import lombok.Data;
import org.example.enums.VehicleType;

@Data
@Builder
public class Reservation {
    String resId;
    VehicleType vehicleType;
    String userId;
}
