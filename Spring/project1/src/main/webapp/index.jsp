<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
        	background-image:url('C:\Users\HP\eclipse-workspace\Project\images\bg.jpg');
            background-size: cover;
            height: 100vh;
            margin: 0;
        }
        .btn-custom {
            margin:auto;
            margin-bottom: 10px;
            display:flex;
            justify-content:center;
            align-items:center;
            width:150px;
        }
        .navbar {
            background-color: #FF9933;
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1000;
        }
        .navbar-brand img {
            height: 40px;
        }
        .navbar-nav .nav-link {
            color: white !important;
            font-size: 1rem;
        }
        .content {
            margin-top: 80px;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#home.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#about.jsp">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contact.jsp">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="content">
        <div>
            <h1 class="mb-4" style="display:flex;justify-content:center;align-items:center;font-family:Georgia, 'Times New Roman', Times, serif">Welcome to PS fruit Shop</h1>
            <a href="signin.jsp" class="btn btn-danger btn-custom">Sign In</a>
            <a href="signup.jsp" class="btn btn-warning btn-custom">Sign Up</a>
        </div>
    </div>

    <!-- Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
