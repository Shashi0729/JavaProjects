<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Signup Page</title>
    <style>
        body {
            font-family:Georgia, 'Times New Roman', Times, serif;
        }
        .form-container {
            width: 100%;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        .form-container h2 {
            text-align: center;
        }
        .form-container input {
            display:block;
            width: 50%;
            padding: 10px;
            margin: 10px 10px;
            border: 1px solid black;
            border-radius: 5px;
        }
        .form-container button {
            width: 100px;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            
        }
       #sub{
            background-color: #45a049;
            margin:20px;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Signup Form</h2>
        <form action="SignupSubmit" method="post">
        
            <label for="userName">Name:</label>
            <input type="text" id="userName" name="userName" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="contactNo">Contact Number:</label>
            <input type="text" id="contactNo" name="contactNo" required>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>

            <label for="nationality">Nationality:</label>
            <input type="text" id="nationality" name="nationality" required>

            <label for="state">State:</label>
            <input type="text" id="state" name="state" required>

            <label for="city">City:</label>
            <input type="text" id="city" name="city" required>

            <label for="localAddress">Local Address:</label>
            <input type="text" id="localAddress" name="localAddress" required>

            <label for="localAddressPincode">Local Address Pincode:</label>
            <input type="number" id="localAddressPincode" name="localAddressPincode" required>

            <label for="permanentAddress">Permanent Address:</label>
            <input type="text" id="permanentAddress" name="permanentAddress" required>

            <label for="permanentAddressPincode">Permanent Address Pincode:</label>
            <input type="text" id="permanentAddressPincode" name="permanentAddressPincode" required>

            <input type="submit" value="submit">
        </form>
    </div>
</body>
</html>
