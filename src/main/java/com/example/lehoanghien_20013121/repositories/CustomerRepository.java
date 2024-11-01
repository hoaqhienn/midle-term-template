package com.example.lehoanghien_20013121.repositories;

import com.example.lehoanghien_20013121.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {
    private EntityManager em;
    private EntityTransaction trans;

    public CustomerRepository() {
        em = Persistence
                .createEntityManagerFactory("lab_week_2")
                .createEntityManager();
        trans = em.getTransaction();
    }

    public List<Customer> findAll() {
        return em.createNamedQuery("Customer.findAll", Customer.class)
                .getResultList();
    }
}
