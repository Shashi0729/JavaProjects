<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Seeker Registration</title>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }
        header {
            background-color: #2c3e50;
            color: white;
            padding: 20px;
            text-align: center;
        }
        footer {
            background-color: #2c3e50;
            color: white;
            padding: 10px;
            text-align: center;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
        }
        label {
            font-weight: bold;
            margin-top: 10px;
            display: block;
        }
        input, select, textarea {
            width: 100%;
            padding: 10px;
            margin: 5px 0 20px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #27ae60;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #2ecc71;
        }
    </style>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    
</head>
<body>

    <!-- Header -->
    <header>
        <h1><b>Kelasa.com</b></h1>
    </header>

    <!-- Main content -->
    <div class="container">
        <h2>Job Seeker Registration</h2>
        <form action="update" method="POST">
            <!-- Personal Information -->
             
            <input type="hidden" id="id" name="id" value="${search.id}">
            
            <label for="fullName">Full Name</label>
            <input type="text" id="fullName" name="fullName" value="${search.fullname}" required>

            <label for="email">Email Address</label>
            <input type="email" id="email" name="email" value="${search.email}" required>

            <label for="phone">Phone Number</label>
            <input type="tel" id="phone" name="phone" value="${search.phone}" required>

            <label for="location">Location</label>
            <input type="text" id="location" name="location" value="${search.location}" required>

            <!-- Job Preferences -->
            <label for="jobTitle">Preferred Job Title</label>
            <input type="text" id="jobTitle" name="jobTitle" value="${search.jobtitle}"required>

            <label for="jobType">Job Type</label>
            <select id="jobType" name="jobType" value="${search.jobtype}" required>
                <option value="full-time">Full-time</option>
                <option value="part-time">Part-time</option>
                <option value="freelance">Freelance</option>
                <option value="internship">Internship</option>
            </select>

            <label for="salaryExpectation">Salary Expectation</label>
            <input type="number" id="salaryExpectation" name="salaryExpectation" value="${search.salaryexpectation}" required>

            <label for="skills">Key Skills</label>
            <input type="text" id="skills" name="skills" rows="4"  value="${search.skills}"required><br><br>

            <!-- Submit Button -->
            <input type="submit" value="UpdateApplication">
        </form>
    </div>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Job Seeker Portal | All Rights Reserved</p>
    </footer>

</body>
</html>