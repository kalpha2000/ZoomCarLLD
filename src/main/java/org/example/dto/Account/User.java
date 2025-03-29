package org.example.dto.Account;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.example.dto.Reservation;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends Account {
    String licenseInfo;
    List<String> reservationIds;
}
