package com.naveen.contracts;

import com.naveen.beans.Employee;

import java.util.List;

public interface IEmployeeDAO {
    public boolean insertEmployee(Employee employee);
    public void deleteEmployee(int empId);
    public Employee updateEmployeeEmail(int empId, String email);

    public Employee getEmployee(int empId);
    public List<Employee> getEmployees();


}
