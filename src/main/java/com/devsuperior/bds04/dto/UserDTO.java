package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class UserDTO implements Serializable {

    private Long id;
    private String email;
    private String password;
    private Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public UserDTO(User entity) {
        this(entity.getId(), entity.getEmail(), entity.getPassword());
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }
}
