package com.backend.BackendJWT.Models.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateClienteRequest {
    private String password;
    private String email;
    private String phoneNumber;
}