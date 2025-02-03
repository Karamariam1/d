package com.universia.gestion_demande.dao;

import com.universia.gestion_demande.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
