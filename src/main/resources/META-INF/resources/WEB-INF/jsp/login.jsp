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
                    <form action="/login" method="post">
                        <div class="form-group">
                            <label for="username">Email</label>
                            <input type="text" class="form-control" id="username" name="email">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" id="password" name="password">
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Login</button>
                    </form>
                    <div class="text-center mt-3">
                        <p class="text-center mt-3">Don't have an account? <a href="register">Register here</a></p>
                    </div>
                    <div class="text-center mt-3">
                        <a href="#forgotPassword">Forgot Password?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
