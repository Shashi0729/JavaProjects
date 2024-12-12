<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
        /* Basic styles for header and footer */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #333;
            color: white;
            padding: 20px;
            text-align: right;
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
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
    </style>
</head>
<body>

    
    <header>
        <img alt="Logo" class="logo" align="left">
        <a href="add.jsp">
    <input type="button" value="Add">
</a>
    </header>

    
    <div>
        <h1>Welcome to My Website</h1>
        <p></p>
    </div>

   
    <footer>
        <p>&copy; <span id="year"></span> My Website. All Rights Reserved.</p>
        <p>Current Date and Time: <span id="dateTime"></span></p>
    </footer>

    
    <script>
       
        function displayDateTime() {
            const now = new Date();
            const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', hour: 'numeric', minute: 'numeric', second: 'numeric', hour12: true };
            document.getElementById("dateTime").textContent = now.toLocaleString('en-US', options);

            
            document.getElementById("year").textContent = now.getFullYear();
        }

       
        window.onload = displayDateTime;
    </script>


</body>
</html>