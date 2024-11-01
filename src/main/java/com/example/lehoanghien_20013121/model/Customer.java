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
@Table(name = "customer")
@NamedQueries({
        @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
})
public class Customer {
    @Id
    @Column(name = "cust_id", nullable = false)
    private Integer id;

    @Column(name = "cust_name", length = 100)
    private String custName;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "address")
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(custName, customer.custName) && Objects.equals(email, customer.email) && Objects.equals(phone, customer.phone) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, custName, email, phone, address);
    }
}