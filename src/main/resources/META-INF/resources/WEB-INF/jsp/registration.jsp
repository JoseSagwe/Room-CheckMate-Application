<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Room Check Mate - Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .registration-form {
            max-width: 400px;
            margin: 50px auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            font-weight: bold;
        }
        .status-message {
            margin-top: 20px;
            text-align: center;
        }
        .success-message {
            color: #28a745;
        }
        .error-message {
            color: #dc3545;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="registration-form">
        <h2 class="text-center">Room Check Mate Registration</h2>
        <form action="register" method="post">
            <!-- Form fields remain unchanged -->
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" id="firstName" name="first_name" required>
            </div>
            <!-- ... (other form fields) ... -->
            <button type="submit" class="btn btn-primary btn-block">Register</button>
        </form>
        <div class="status-message">
            <p class="success-message">${successMessage}</p>
            <p class="error-message">${errorMessage}</p>
        </div>
        <p class="text-center mt-3">Already have an account? <a href="login">Login here</a></p>
    </div>
</div>

</body>
</html>
