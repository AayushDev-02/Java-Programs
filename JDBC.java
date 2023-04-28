package com.company;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");          // step 0 - load drivers

            String conn_string = "jdbc:mysql://localhost/db1?" + "user=root&password=pagein30";

            conn = DriverManager.getConnection(conn_string);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Student");


        }catch (SQLException e){
            System.out.println("SQLException " + e.getMessage());
            System.out.println("SQLState" + e.getSQLState());
            System.out.println("VendorError" + e.getErrorCode());
        }
        finally {
            if(rs!= null && stmt != null){
                rs.close();
                stmt.close();

                rs= null;
                stmt = null;
            }
            conn.close();
        }
    }
}
