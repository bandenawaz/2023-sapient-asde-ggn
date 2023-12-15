package com.naveen.dao;

import com.naveen.beans.Employee;
import com.naveen.contracts.IEmployeeDAO;
import com.naveen.util.GetConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO implements IEmployeeDAO {


    @Override
    public boolean insertEmployee(Employee employee) {

        String sql ="insert into employee values(?,?,?,?)";

        try {
            PreparedStatement ps = GetConnection.getMysqlConnection()
                    .prepareStatement(sql);
            ps.setInt(1, employee.getEmpId());
            ps.setString(2, employee.getEmpName());
            ps.setDouble(3, employee.getEmpSalary());
            ps.setString(4, employee.getEmpEmail());

            return ps.executeUpdate()> 0;
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return false;
    }

    @Override
    public Employee getEmployee(int empId) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public void deleteEmployee(int empId)   {
        String sql = "delete from employee where empid = ? ";

        try {
            PreparedStatement ps = GetConnection.getMysqlConnection().prepareStatement(sql);
            ps.setInt(1, empId);

            ps.executeUpdate();
            System.out.println("Record Delete with id " + empId);
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }



    }

    @Override
    public Employee updateEmployeeEmail(int empId, String email) {
        // TODO 
        return null;
    }
}
