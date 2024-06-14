<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date and Time</title>
</head>
<body>
    <h2>Current Date and Time</h2>
    <p>
        Current Date (using java.util.Date): 
        <%= new Date() %>
    </p>
    <p>
        Current Date and Time (using java.time.LocalDateTime):
        <%= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) %>
    </p>
</body>
</html>
