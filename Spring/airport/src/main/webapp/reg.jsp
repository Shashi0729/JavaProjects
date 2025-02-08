<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }

        /* Header Styling */
        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #4CAF50;
            padding: 10px 20px;
            color: white;
        }

        .logo {
            font-size: 24px;
            font-weight: bold;
        }

        .container {
            width: 400px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin: 50px auto;
        }

        h2 {
            text-align: center;
        }

        .form-container {
            display: flex;
            flex-direction: column;
        }

        label {
            margin: 10px 0 5px;
            font-weight: bold;
        }

        input {
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-left:45%;
        }

        button:hover {
            background-color: #45a049;
        }

        p {
            text-align: center;
        }

        a {
            color: #4CAF50;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        /* Footer Styling */
        .footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>

    <!-- Header -->
    <div class="header">
        <div class="logo">Airport Logo</div>
        <div></div> <!-- Empty space for alignment -->
    </div>

    <div class="container">
        <h2>Register as an Airport Worker</h2>
        <form  action="submit" method="post">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="fullName" required> <br>

            <label for="email">Email Address:</label>
            <input type="email" id="email" name="emailAddress" required><br>

            <label for="role">Role:</label>
            <input type="text" id="role" name="role" required><br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>


            <input type="submit" value="submit">
        </form>
        <p>Already have an account? <a href="login.jsp">Login here</a></p>
    </div>

    <!-- Footer -->
    <div class="footer">
        <p>Current Date & Time: 
        <%= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) %>
        </p>
    </div>

</body>
</html>