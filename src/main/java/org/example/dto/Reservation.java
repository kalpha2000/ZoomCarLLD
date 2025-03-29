package org.example.dto;

import lombok.Builder;
import lombok.Data;
import org.example.dto.Vehicle.Vehicle;

@Data
@Builder
public class Reservation {
    String resId;
    String vehicleId;
    String userId;
}
