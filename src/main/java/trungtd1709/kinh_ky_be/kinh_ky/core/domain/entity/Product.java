package trungtd1709.kinh_ky_be.kinh_ky.core.domain.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    private String name;

    @Column(length = 20, nullable = false, unique = true)
    private String productCode;

    private Integer price;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}
