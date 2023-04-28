package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_insert {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aayush", "root", "pagein30");
            Statement s = con.createStatement();
            s.executeUpdate("INSERT INTO table1 VALUES (20,'New Entry', 44,'Male','BCE',200)");

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
