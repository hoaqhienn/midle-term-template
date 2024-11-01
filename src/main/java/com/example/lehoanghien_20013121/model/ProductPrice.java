package com.example.lehoanghien_20013121.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Objects;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_price")
public class ProductPrice {
    @EmbeddedId
    private ProductPriceId id;

    @MapsId("productId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Lob
    @Column(name = "note")
    private String note;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPrice that = (ProductPrice) o;
        return Objects.equals(id, that.id) && Objects.equals(product, that.product) && Objects.equals(price, that.price) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, price, note);
    }
}