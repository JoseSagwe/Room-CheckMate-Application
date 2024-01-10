<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Room Checker - Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <!-- Login form -->
        <div class="col-md-6 mt-5" id="login">
            <div class="card">
                <div class="card-header bg-primary text-white text-center">
                    <h3>Room Checkmate Login</h3>
                </div>
                <div class="card-body">
                    <pre>${errorMessage}</pre>
                    <form action="/welcome" method="post">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" class="form-control" id="username" name="username">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" id="password" name="password">
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Login</button>
                    </form>
                    <div class="text-center mt-3">
                        <a href="#registration" onclick="switchForm('registration')">Don't have an account? Register </a>
                    </div>
                    <div class="text-center mt-3">
                        <a href="#forgotPassword">Forgot Password?</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- Registration form -->
        <div class="col-md-6 mt-5" id="registration" style="display:none;">
            <div class="card">
                <div class="card-header bg-success text-white text-center">
                    <h3>Room Checkmate Registration</h3>
                </div>
                <div class="card-body">
                    <form method="post">
                        <div class="form-group">
                            <label for="newUsername">Username</label>
                            <input type="text" class="form-control" id="newUsername" name="newUsername">
                        </div>
                        <div class="form-group">
                            <label for="newPassword">Password</label>
                            <input type="password" class="form-control" id="newPassword" name="newPassword">
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email" name="email">
                        </div>
                        <div class="form-group">
                            <label for="registrationNumber">Registration Number</label>
                            <input type="text" class="form-control" id="registrationNumber" name="registrationNumber">
                        </div>
                        <!-- Include more related input fields here -->
                        <button type="submit" class="btn btn-success btn-block">Register</button>
                    </form>
                    <div class="text-center mt-3">
                        <a href="#login" onclick="switchForm('login')">Already have an account? Login</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    function switchForm(formType) {
        if (formType === 'login') {
            document.getElementById('login').style.display = 'block';
            document.getElementById('registration').style.display = 'none';
        } else {
            document.getElementById('login').style.display = 'none';
            document.getElementById('registration').style.display = 'block';
        }
    }
</script>
</body>
</html
