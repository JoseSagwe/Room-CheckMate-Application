<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Room Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }

        .container {
            max-width: 800px;
            margin-top: 50px;
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #007bff;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #007bff;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        .btn-primary {
            display: block;
            width: 100%;
            margin-top: 20px;
        }

        .status-occupied {
            background-color: #dc3545;
            color: #ffffff;
            padding: 5px 10px;
            border-radius: 5px;
        }

        .status-available {
            background-color: #28a745;
            color: #ffffff;
            padding: 5px 10px;
            border-radius: 5px;
        }
    </style>
</head>
<body>

<%@include file="common/navigation.jspf"%>

<div class="container">
    <h2>Room Details</h2>
    <table class="table">
        <thead>
        <tr>
<%--            <th>ID</th>--%>
            <th>Block</th>
            <th>Room Number</th>
            <th>Time</th>
            <th>Status</th>
<%--            <th>Capacity</th> --%>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="room" items="${rooms}">
            <tr>
<%--                <td>${room.id}</td>--%>
                <td>${room.block}</td>
                <td>${room.roomNumber}</td>
                <td>${room.time}</td>
<%--                <td>${room.capacity}</td>--%>
                <td>
                    <c:choose>
                        <c:when test="${room.status == 'Occupied'}">
                            <span class="status-occupied">${room.status}</span>
                        </c:when>
                        <c:when test="${room.status == 'Available'}">
                            <span class="status-available">${room.status}</span>
                        </c:when>
                    </c:choose>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/availableRoomsForm" class="btn btn-primary">Go Back</a>
</div>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
