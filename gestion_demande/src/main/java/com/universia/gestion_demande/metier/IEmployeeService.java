package com.universia.gestion_demande.metier;

import com.universia.gestion_demande.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IEmployeeService {
    public Employee addEmployee(Employee e);
    public Employee getEmployeeById(Integer id);
    public List<Employee> getAllEmployees();
}
