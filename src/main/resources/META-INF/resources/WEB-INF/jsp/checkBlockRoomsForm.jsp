<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Room Selection Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background: url('/static/images/background.jpg') no-repeat center center fixed;
            background-size: cover;
        }
        .form-container {
            background-color: rgba(255, 255, 255, 0.7);
            padding: 30px;
            border-radius: 10px;
            margin-top: 100px;
        }
        h2 {
            text-align: center;
            margin-bottom: 30px;
            font-weight: bold;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            font-weight: bold;
        }
        select {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<%@include file="common/navigation.jspf"%>

<div class="container">
    <div class="row">
        <div class="col-sm-4"></div>
        <div class="col-sm-4 form-container">
            <h2>Select Block</h2>
            <form action="/getRooms" method="post">
                <div class="form-group">
                    <label for="block">Select Block:</label>
                    <select class="form-control" name="block" id="block">
                        <option value="TBH">TBH</option>
                        <option value="Northern">Northern</option>
                    </select>
                </div>
                <input type="submit" class="btn btn-primary" value="Submit">
            </form>
            <a href="availableLTForm" class="btn btn-primary mt-4">Lecture Theater (LT)</a>
        </div>
        <div class="col-sm-4"></div>
    </div>
</div>
</body>
</html>
