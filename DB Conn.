package feemanagement;
import java.sql.*;

public class DBConnection {

    Connection con;

    // Constructor (Connection Setup)
    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fee_management",
                "root",
                "root"   // 👉 apna MySQL password yaha daalna
            );

            System.out.println("Database Connected Successfully ✅");

        } catch(Exception e) {
            System.out.println("Connection Failed ❌");
            e.printStackTrace();
        }
    }

    // 🔥 MAIN METHOD (Run karke test karo)
    public static void main(String[] args) {

        DBConnection db = new DBConnection();

        try {
            // Test Query
            String query = "SELECT * FROM student";

            Statement stmt = db.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Student Data 👇");

            while(rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    " | Name: " + rs.getString("name") +
                    " | Course: " + rs.getString("course") +
                    " | Email: " + rs.getString("email")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
