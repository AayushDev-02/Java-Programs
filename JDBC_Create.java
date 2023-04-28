package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Create {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aayush", "root", "pagein30");
            Statement s = con.createStatement();
            s.executeUpdate("CREATE TABLE Employee (id INTEGER NOT NULL PRIMARY KEY, name VARCHAR(300))");

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
