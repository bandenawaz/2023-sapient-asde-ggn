package com.naveen.dao;

import com.naveen.beans.Employee;
import com.naveen.contracts.IEmployeeDAO;
import com.naveen.util.GetConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql  = "select empid, empname, empsalary, empemail from employee where empid = ?";

        try {
            PreparedStatement ps = GetConnection.getMysqlConnection().prepareStatement(sql);
            ps.setInt(1, empId);

            final ResultSet resultSet = ps.executeQuery();

            if(resultSet.next()) {
                Employee temp = new Employee();
                temp.setEmpId(empId);
                temp.setEmpName(resultSet.getString(2));
                temp.setEmpSalary(resultSet.getDouble(3));
                temp.setEmpEmail(resultSet.getString(4));
                return temp;
            }
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        String sql  = "select empid, empname, empsalary, empemail from employee";
        List<Employee> list = null ;
        try {
            PreparedStatement ps = GetConnection.getMysqlConnection().prepareStatement(sql);
            list = new ArrayList<>();
            final ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Employee temp = new Employee();
                temp.setEmpId(resultSet.getInt(1));
                temp.setEmpName(resultSet.getString(2));
                temp.setEmpSalary(resultSet.getDouble(3));
                temp.setEmpEmail(resultSet.getString(4));

                list.add(temp);
            }
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return  list;

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
