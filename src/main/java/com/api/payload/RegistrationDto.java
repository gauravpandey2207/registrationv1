package com.api.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {
    @NotEmpty
    @Size(min = 2, message = "Min should be 2 letters")
    private String name;

    @Email
    private String email;

    @Size(min = 10,max = 10,message = "Should be 10 digit letters")
    private String mobile;

    }

