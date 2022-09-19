package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.Role;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RoleDTO implements Serializable {

    private Long id;
    private String authority;

    public RoleDTO(Role entity) {
        this(entity.getId(), entity.getAuthority());
    }
}
