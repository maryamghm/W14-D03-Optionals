package org.example;

import lombok.Data;
import lombok.NonNull;

import java.util.Optional;

@Data
public class UserProfile {
    @NonNull
    private String username;
    @NonNull
    private String email;
    private Optional<String> phoneNumber;
    private Optional<String> address;

    public UserProfile(@NonNull String username, @NonNull String email, Optional<String> phoneNumber, Optional<String> address) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber != null ? phoneNumber : Optional.empty();
        this.address = address != null ? address : Optional.empty();
    }
 }

