package org.example.dto.Vehicle;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.enums.VechicleStatus;
import org.example.enums.VehicleType;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Bicycle extends Vehicle{
}
