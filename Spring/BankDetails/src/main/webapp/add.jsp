<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        }
        header {
            background-color: #333;
            color: white;
            padding: 20px;
            text-align: center;
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: static;
            width: 100%;
            bottom: 0;
        }
        .logo {
            width: 100px;
        }
        .btn-add {
            padding: 10px 20px;
            background-color: #28a745;
            color: white;
            border: none;
            cursor: pointer;
        }
        .btn-add:hover {
            background-color: #218838;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"], input[type="number"], input[type="tel"], textarea {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        textarea {
            resize: vertical;
            height: 100px;
        }
        button {
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    
    <header>
        <img  alt="Logo" > 
               <a href="index.jsp">
    <input type="button" value="Back">
</a>
    </header>

   
    <div class="container">
        <h1>Bank Information Form</h1>
        <form action="submit" >
            <div class="form-group">
                <label for="bankName">Bank Name</label>
                <input type="text" id="bankName" name="bankName" required>
            </div>
            <div class="form-group">
                <label for="contactNo">Contact Number</label>
                <input type="number" id="contactNo" name="bankContactNo" required>
            </div>
            <div class="form-group">
                <label for="ifsc">IFSC Code</label>
                <input type="text" id="ifsc" name="bankIFSC" required>
            </div>
            <div class="form-group">
                <label for="bankAddress">Bank Address</label>
                <textarea id="bankAddress" name="bankAddress" required></textarea>
            </div>
            <div class="form-group">
                <label for="createdBy">Created By</label>
                <input type="text" id="createdBy" name="createdBy" required>
            </div>
            <input type="submit">Submit
        </form>
    </div>

   
    <footer>
        <p>&copy; <span id="year"></span> My Website. All Rights Reserved.</p>
        <p>Current Date and Time: <span id="dateTime"></span></p>
    </footer>

    
    <script>
        // Get current date and time
        function displayDateTime() {
            const now = new Date();
            const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', hour: 'numeric', minute: 'numeric', second: 'numeric', hour12: true };
            document.getElementById("dateTime").textContent = now.toLocaleString('en-US', options);

            // Set current year in footer
            document.getElementById("year").textContent = now.getFullYear();
        }

        // Call the function when the page loads
        window.onload = displayDateTime;
    </script>

</body>
</html>