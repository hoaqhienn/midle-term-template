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
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "emp_id", nullable = false)
    private Integer id;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "address")
    private String address;

    @Lob
    @Column(name = "status")
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(fullName, employee.fullName) && Objects.equals(dob, employee.dob) && Objects.equals(email, employee.email) && Objects.equals(phone, employee.phone) && Objects.equals(address, employee.address) && Objects.equals(status, employee.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, dob, email, phone, address, status);
    }
}