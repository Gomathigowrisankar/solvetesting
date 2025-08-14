package com.edutech.logisticsmanagementandtrackingsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutech.logisticsmanagementandtrackingsystem.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Additional business-related query methods can be added here
}