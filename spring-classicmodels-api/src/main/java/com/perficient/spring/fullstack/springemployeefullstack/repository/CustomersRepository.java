
package com.perficient.spring.fullstack.springemployeefullstack.repository;

import com.perficient.spring.fullstack.springemployeefullstack.dao.Customers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {}