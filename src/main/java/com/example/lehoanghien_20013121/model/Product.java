package com.example.lehoanghien_20013121.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "unit", length = 50)
    private String unit;

    @Column(name = "manufacturer_name", length = 100)
    private String manufacturerName;

    @Lob
    @Column(name = "status")
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(unit, product.unit) && Objects.equals(manufacturerName, product.manufacturerName) && Objects.equals(status, product.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, unit, manufacturerName, status);
    }
}