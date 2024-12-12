<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
thead,tbody,tr,th{
 border :solid 2px;
}
tbody,td{
border : solid 1px;
}

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
<body>

   <header>
        <img  alt="Logo" > 
               <a href="index.jsp">
    <input type="button" value="Back">
</a>
    </header>
<table align="center">
<thead>
<tr>
<th>GameName</th>
<th>Generation</th>
<th>ReleaseDate</th>
<th>Rating</th>
<th>Developer</th>
<th>Platform</th>
<th>Publisher</th>
<th>Description</th>
<th>CreatedBy</th>
<th>CreatedOn</th>

</tr>
</thead>
<tbody>
<tr>
<td>${save.gameName}</td>
<td>${save.genre}</td>
<td>${save.releaseDate}</td>
<td>${save.rating}</td>
<td>${save.developer}</td>
<td>${save.platform}</td> 
<td>${save.publisher}</td> 
<td>${save.description}</td> 
<td>${save.createdBy}</td> 
<td>${save.createdOn}</td> 

</tr>
</tbody>
</table>

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