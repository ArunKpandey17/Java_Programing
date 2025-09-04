package jdbc_program;

import java.sql.*;

public class RetrieveTable {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String user = "system";
        String password = "arun";

        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver");

           
            Connection con = DriverManager.getConnection(url, user, password);

           
            Statement stmt = con.createStatement();

           
            ResultSet rs = stmt.executeQuery("SELECT * FROM SCHOOL_STUDENT");

            
            System.out.println("ID\tSNAME\t\tFESS");
            System.out.println("---------------------------------");

            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                int id = rs.getInt("ID");       
                String name = rs.getString("SNAME");
                int fess = rs.getInt("FESS");
                System.out.println(id + "\t" + name + "\t\t" + fess);
            }

            if (!hasData) {
                System.out.println(" No data found in SCHOOL_STUDENT table.");
            }

           
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
