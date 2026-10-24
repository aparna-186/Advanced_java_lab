
import java.sql.*;

public class ScrollableResultSetExample {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/two", "root", "root");

            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS Employee (" +
                            "EmpID INT PRIMARY KEY, " +
                            "Name VARCHAR(50), " +
                            "Dept VARCHAR(50))");

            stmt.executeUpdate(
                    "INSERT IGNORE INTO Employee VALUES " +
                            "(101, 'Ravi', 'HR'), " +
                            "(102, 'Sneha', 'IT'), " +
                            "(103, 'Amit', 'Finance'), " +
                            "(104, 'Priya', 'IT'), " +
                            "(105, 'Kiran', 'Marketing')");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            System.out.println("--- Forward Direction ---");
            while (rs.next()) {
                System.out.println(rs.getInt("EmpID") + " " +
                        rs.getString("Name") + " " +
                        rs.getString("Dept"));
            }

            System.out.println("\n--- Backward Direction ---");
            while (rs.previous()) {
                System.out.println(rs.getInt("EmpID") + " " +
                        rs.getString("Name") + " " +
                        rs.getString("Dept"));
            }

            rs.first();
            System.out.println("\nFirst Record: " +
                    rs.getInt("EmpID") + " " + rs.getString("Name"));
            System.out.println("First row: " + rs.getRow());

            rs.last();
            System.out.println("Last Record: " +
                    rs.getInt("EmpID") + " " + rs.getString("Name"));
            System.out.println("Last row: " + rs.getRow());

            rs.absolute(3);
            System.out.println("Third Record: " +
                    rs.getInt("EmpID") + " " + rs.getString("Name"));
            System.out.println("Third row: " + rs.getRow());

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
