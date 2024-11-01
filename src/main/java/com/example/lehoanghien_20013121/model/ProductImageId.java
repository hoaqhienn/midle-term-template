package com.example.lehoanghien_20013121.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class ProductImageId implements Serializable {
    private static final long serialVersionUID = 3462771911645672039L;
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "image_id", nullable = false)
    private Integer imageId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductImageId entity = (ProductImageId) o;
        return Objects.equals(this.imageId, entity.imageId) &&
                Objects.equals(this.productId, entity.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, productId);
    }

}