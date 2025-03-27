package org.example.dto.Account;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Account {
    String id;
    String email;
    String pwd;
}
