<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Game Information Form</title>
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
        input[type="text"], input[type="number"], input[type="date"], textarea {
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
        <img src="logo.png" alt="Logo" class="logo"> 
       
    </header>

    <!-- Main Content Section -->
    <div class="container">
        <h1>Game Information Form</h1>
        <form action="submit" >
            <div class="form-group">
                <label for="gameName">Game Name</label>
                <input type="text" id="gameName" name="gameName" required>
            </div>
            <div class="form-group">
                <label for="genre">Genre</label>
                <input type="text" id="genre" name="genre" required>
            </div>
            <div class="form-group">
                <label for="platform">Platform</label>
                <input type="text" id="platform" name="platform" required>
            </div>
            <div class="form-group">
                <label for="releaseDate">Release Date</label>
                <input type="date" id="releaseDate" name="releaseDate" required>
            </div>
            <div class="form-group">
                <label for="rating">Rating</label>
                <input type="number" id="rating" name="rating" min="1" max="10" required>
            </div>
            <div class="form-group">
                <label for="developer">Developer</label>
                <input type="text" id="developer" name="developer" required>
            </div>
            <div class="form-group">
                <label for="publisher">Publisher</label>
                <input type="text" id="publisher" name="publisher" required>
            </div>
           
            <div class="form-group">
                <label for="description">Description</label>
                <textarea id="description" name="description" required></textarea>
            </div>
             <div class="form-group">
                <label for="publisher">CreatedBy</label>
                <input type="text" id="publisher" name="createdBy" required>
            </div>
            <button type="submit">Submit</button>
        </form>
    </div>

    <!-- Footer Section -->
    <footer>
        <p>&copy; <span id="year"></span> My Website. All Rights Reserved.</p>
        <p>Current Date and Time: <span id="dateTime"></span></p>
    </footer>

    <!-- JavaScript for Footer -->
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
