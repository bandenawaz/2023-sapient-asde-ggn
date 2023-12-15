package com.naveen.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

    public Connection getMysqlConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost/sapdb",
                            "root", "kanchan@1");

            return conn;
        }catch(SQLException sqle) {
            sqle.printStackTrace();
        }catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(new GetConnection().getMysqlConnection()!=null?
                    "connected":"NotConnected");
    }

}
