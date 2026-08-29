<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Retrieve Student Records</title>
</head>

<body>

<h2>Student Table Records</h2>

<%
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to MySQL database
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ap",
                "root",
                "root"
        );

        // Create statement
        stmt = con.createStatement();

        // Execute query
        rs = stmt.executeQuery("SELECT * FROM Student");

        // Display records
        while (rs.next()) {
            out.println(
                    "RollNo: " + rs.getInt("RollNo") +
                            " , Name: " + rs.getString("Name") +
                            " , Address: " + rs.getString("Address") +
                            "<br>"
            );
        }

    } catch (Exception e) {
        out.println(e);
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (Exception e) {
            out.println(e);
        }
    }
%>

</body>
</html>