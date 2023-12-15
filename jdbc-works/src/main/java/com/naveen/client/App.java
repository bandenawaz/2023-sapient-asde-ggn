package com.naveen.client;

import com.naveen.beans.Employee;
import com.naveen.contracts.IEmployeeDAO;
import com.naveen.dao.EmployeeDAO;

public class App {

    public static void main(String[] args) {
        IEmployeeDAO dao = new EmployeeDAO();

        Employee employee = new Employee(104, "shashank",
                5544, "shashank@ps.com");

//        System.out.println(dao.insertEmployee(employee)?"Inserted" :"Not Inserted");

        dao.deleteEmployee(101);

    }



}
