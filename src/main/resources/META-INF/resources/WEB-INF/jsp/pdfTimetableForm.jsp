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
    <h2>Select Program To Automatically Generate Timetable</h2>
    <form action="/openpdf/timetable" method="post">
<%--        <div class="form-group">--%>
<%--            <label for="school">Select School:</label>--%>
<%--            <select class="form-control" name="school" id="school">--%>
<%--                <option value="Science and Computing">Science And Computing</option>--%>
<%--                <option value="Life Sciences">Life Sciences</option>--%>
<%--                <option value="School of Education">School of Education</option>--%>
<%--                <!-- Add more departments if needed -->--%>
<%--            </select>--%>
<%--        </div>--%>
        <div class="form-group">
            <label for="program">Select Program:</label>
            <select class="form-control" name="program" id="program">
                <option value="Information Technology">Information Technology</option>
                <option value="Computer Science">Computer Science</option>
                <option value="Software Engineering">Software Engineering</option>
                Software Engineering
                <!-- Add more programs if needed -->
            </select>
        </div>
        <button type="submit" class="btn btn-primary">View Timetable</button>
    </form>
    <p class="mt-3 text-center">Click the button to view the timetable for the selected School and Program.</p>
</div>
</body>
</html>
