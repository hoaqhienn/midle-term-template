package com.example.lehoanghien_20013121.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class ProductPriceId implements Serializable {
    private static final long serialVersionUID = 4063128175057497738L;
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "price_date_time", nullable = false)
    private Instant priceDateTime;

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPriceId entity = (ProductPriceId) o;
        return Objects.equals(this.priceDateTime, entity.priceDateTime) &&
                Objects.equals(this.productId, entity.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceDateTime, productId);
    }

}