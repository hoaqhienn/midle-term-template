package com.example.lehoanghien_20013121.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_image")
public class ProductImage {
    @EmbeddedId
    private ProductImageId id;

    @MapsId("productId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "path")
    private String path;

    @Column(name = "alternative")
    private String alternative;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductImage that = (ProductImage) o;
        return Objects.equals(id, that.id) && Objects.equals(product, that.product) && Objects.equals(path, that.path) && Objects.equals(alternative, that.alternative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, path, alternative);
    }
}