import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_update {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aayush", "root", "pagein30");
            Statement s = con.createStatement();
            s.executeUpdate("UPDATE table1 SET name='Raju' WHERE roll_no=20");

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
