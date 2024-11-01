package com.example.lehoanghien_20013121.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id", nullable = false)
    private Integer id;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id")
    private Employee emp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_id")
    private Customer cust;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderDate, order.orderDate) && Objects.equals(emp, order.emp) && Objects.equals(cust, order.cust);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, emp, cust);
    }
}