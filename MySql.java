package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aayush", "root", "pagein30");

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from table1");

            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);;
        }

    }
}
