<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Timetable Display</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .timetable {
            margin: 50px auto;
            width: 80%;
        }
        th, td {
            text-align: center;
        }
        th {
            background-color: #007bff;
            color: #fff;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<%@include file="common/navigation.jspf"%>

<div class="container">
    <div class="timetable">
        <h2>Semester Timetable for ${program}</h2>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>Weekday</th>
                <th>Time</th>
                <th>Unit Code</th>
                <th>Unit Name</th>
                <th>Lecture</th>
                <th>Venue</th>
            </tr>
            </thead>
            <tbody>
            <c:set var="weekdays" value="Monday,Tuesday,Wednesday,Thursday,Friday" />
            <c:forEach var="weekday" items="${weekdays}">
                <tr>
                    <td rowspan="4">${weekday}</td>
                    <td>7am - 10am</td>
                    <c:forEach var="timetable" items="${timetable}">
                        <c:if test="${timetable.weekDay == weekday && timetable.time == '7am - 10am'}">
                            <td>${timetable.unitCode}</td>
                            <td>${timetable.unitName}</td>
                            <td>${timetable.lecture}</td>
                            <td>${timetable.venue}</td>
                        </c:if>
                    </c:forEach>
                </tr>
                <tr>
                    <td>10am - 1pm</td>
                    <c:forEach var="timetable" items="${timetable}">
                        <c:if test="${timetable.weekDay == weekday && timetable.time == '10am - 1pm'}">
                            <td>${timetable.unitCode}</td>
                            <td>${timetable.unitName}</td>
                            <td>${timetable.lecture}</td>
                            <td>${timetable.venue}</td>
                        </c:if>
                    </c:forEach>
                </tr>
                <tr>
                    <td>1pm - 4pm</td>
                    <c:forEach var="timetable" items="${timetable}">
                        <c:if test="${timetable.weekDay == weekday && timetable.time == '1pm - 4pm'}">
                            <td>${timetable.unitCode}</td>
                            <td>${timetable.unitName}</td>
                            <td>${timetable.lecture}</td>
                            <td>${timetable.venue}</td>
                        </c:if>
                    </c:forEach>
                </tr>
                <tr>
                    <td>4pm - 7pm</td>
                    <c:forEach var="timetable" items="${timetable}">
                        <c:if test="${timetable.weekDay == weekday && timetable.time == '4pm - 7pm'}">
                            <td>${timetable.unitCode}</td>
                            <td>${timetable.unitName}</td>
                            <td>${timetable.lecture}</td>
                            <td>${timetable.venue}</td>
                        </c:if>
                    </c:forEach>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
