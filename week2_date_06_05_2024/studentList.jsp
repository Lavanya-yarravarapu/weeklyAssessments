<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, com.example.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Information List</title>
</head>
<body>
    <h2>Student Information List</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Grade</th>
        </tr>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            for (Student student : students) {
        %>
        <tr>
            <td><%= student.getName() %></td>
            <td><%= student.getAge() %></td>
            <td><%= student.getGrade() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>