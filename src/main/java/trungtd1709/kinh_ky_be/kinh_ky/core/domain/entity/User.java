package trungtd1709.kinh_ky_be.kinh_ky.core.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;

    private String password;

    private Integer price;

    private String description;
}

