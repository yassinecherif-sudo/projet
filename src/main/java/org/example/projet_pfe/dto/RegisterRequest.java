package org.example.projet_pfe.dto;

import org.example.projet_pfe.entity.Role;
import lombok.Data;

@Data
public class RegisterRequest {

    private String nomUtilisateur;
    private String email;
    private String password;
    private Role role;

}