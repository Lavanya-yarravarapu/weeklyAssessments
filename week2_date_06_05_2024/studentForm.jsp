<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Information Form</title>
</head>
<body>
    <h2>Enter Student Information</h2>
    <form action="student" method="post">
        Name: <input type="text" name="name" /><br/>
        Age: <input type="text" name="age" /><br/>
        Grade: <input type="text" name="grade" /><br/>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>