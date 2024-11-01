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
public class OrderDetailId implements Serializable {
    private static final long serialVersionUID = 4327678627614209803L;
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailId entity = (OrderDetailId) o;
        return Objects.equals(this.productId, entity.productId) &&
                Objects.equals(this.orderId, entity.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, orderId);
    }

}