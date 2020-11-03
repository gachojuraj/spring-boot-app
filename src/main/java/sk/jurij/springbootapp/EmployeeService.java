package sk.jurij.springbootapp;

import sk.jurij.springbootapp.model.Employee;

public interface EmployeeService {
    float getTotalSalary(Employee[] list);
    int getTotalBonuses(Employee[] list);
}
