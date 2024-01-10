<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Timetable Selection</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }

        .container {
            max-width: 600px;
            margin-top: 50px;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #007bff;
        }

        .form-group label {
            font-weight: bold;
            color: #495057;
        }

        button[type="submit"] {
            margin-top: 20px;
            width: 100%;
        }
    </style>
</head>
<body>

<%@include file="common/navigation.jspf"%>

<div class="container">
    <h2>Timetable Selection</h2>
    <form action="#" method="post">
        <div class="form-group">
            <label for="department">Select School:</label>
            <select class="form-control" name="School" id="School">
                <option value="Science And Computing">Science And Computing</option>
                <option value="Life Sciences">Life Sciences</option>
                <option value="School of Education">School of Education</option>
                <!-- Add more departments if needed -->
            </select>
        </div>
        <div class="form-group">
            <label for="department">Select Department:</label>
            <select class="form-control" name="department" id="department">
                <option value="Department of Information Technology">Department of Information Technology</option>
                <option value="Department of Mathematics">Department of Mathematics</option>
                <option value="Department of Physics">Department of Physics</option>
                <!-- Add more departments if needed -->
            </select>
        </div>
        <div class="form-group">
            <label for="course">Select Course:</label>
            <select class="form-control" name="course" id="course">
                <option value="Mathematics 101">Mathematics 101</option>
                <option value="Physics 101">Physics</option>
                <option value="Mathematics">Mathematics</option>
                <option value="Mathematics">Statistics</option>
                <option value="Information Technology">Information Technology</option>
                <option value="Computer Science">Computer Science</option>
                <option value="Education Sciences">Education Sciences</option>
                <option value="Education Humanities">Education Humanities</option>
            </select>
        </div>
        <div class="form-group">
            <label for="course">Select Year of Study:</label>
            <select class="form-control" name="year" id="year">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="5">3</option>
                <option value="4">4</option>

            </select>
        </div>
        <button type="submit" class="btn btn-primary">View Timetable</button>
    </form>
    <p class="mt-3 text-center">Click the button to view the timetable for the selected department and course.</p>
</div>
</body>
</html>
