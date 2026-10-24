
import java.sql.*;

public class UpdatableResultSetExample {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/two", "root", "root");

            stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            // Retrieve existing Employee table records
            rs = stmt.executeQuery(
                    "SELECT EmpID, Name, Dept FROM Employee");

            System.out.println("--- Original Employee Table ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("EmpID") + " " +
                                rs.getString("Name") + " " +
                                rs.getString("Dept"));
            }

            // Insert a new record using ResultSet
            rs.moveToInsertRow();
            rs.updateInt("EmpID", 106);
            rs.updateString("Name", "Rohit");
            rs.updateString("Dept", "Admin");
            rs.insertRow();

            System.out.println(
                    "\nRecord inserted successfully (EmpID=106, Name=Rohit, Dept=Admin)");

            // Update an existing record (change Priya's Dept)
            rs.moveToCurrentRow();
            rs.beforeFirst();

            while (rs.next()) {
                if (rs.getInt("EmpID") == 104) {
                    rs.updateString("Dept", "HR");
                    rs.updateRow();
                    System.out.println(
                            "Record updated successfully (EmpID=104, Dept=HR)");
                    break;
                }
            }

            // Delete a record (delete EmpID=102)
            rs.beforeFirst();

            while (rs.next()) {
                if (rs.getInt("EmpID") == 102) {
                    rs.deleteRow();
                    System.out.println(
                            "Record deleted successfully (EmpID=102)");
                    break;
                }
            }

            // Close the old ResultSet and retrieve final records
            rs.close();

            rs = stmt.executeQuery("SELECT EmpID, Name, Dept FROM Employee");

            System.out.println("\n--- Updated Employee Table ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("EmpID") + " " +
                                rs.getString("Name") + " " +
                                rs.getString("Dept"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
