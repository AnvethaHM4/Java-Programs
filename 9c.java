//9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary into the table Emp of the database Employee by getting the fields through keyboard
//and Generate the report as follows
//CREATE TABLE Emp (
//Emp_NO INTEGER PRIMARY KEY,
//Emp_Name TEXT NOT NULL,
//Basicsalary INTEGER
//);
//-- insert
//INSERT INTO EMPLOYEE VALUES (101, 'Ramesh', 25000);
//INSERT INTO EMPLOYEE VALUES (102, 'Ravi', 20000);
//.....
//Add 5 records into Emp table of Employee database through Java with JDBC
//and generate a salary report as follows by executing query Emp name starting with R
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
//Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Emp_No : 101
//Emp_Name: Ramesh'
//Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Emp_No : 102
//Emp_Name: Ravi
//Basic : 20000

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
....
...
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
  <%@ page import="java.sql.*" %>
<html>
<head>
    <title>Salary Report - Emp Name Starting with Input</title>
    <style>
        body {
            font-family: monospace;
        }
        .line {
            border-top: 1px solid #000;
            margin: 10px 0;
        }
    </style>
</head>
<body>
<h2>Salary Report - Filter by Starting Letter</h2>
<form method="post">
    Enter starting letter: <input type="text" name="start" maxlength="1" required />
    <input type="submit" value="Generate Report" />
</form>

<%
    String start = request.getParameter("start");
    if (start != null && !start.trim().isEmpty()) {
        int grandTotal = 0;
%>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Emp WHERE Emp_Name LIKE ?");
            ps.setString(1, start + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int no = rs.getInt("Emp_NO");
                String name = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");
                grandTotal += salary;
%>
Emp_No    : <%= no %>  
Emp_Name  : <%= name %>  
Basic     : <%= salary %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
            }
            conn.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
%>
Grand Total Salary = <%= grandTotal %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<% } %>
</body>
</html>
