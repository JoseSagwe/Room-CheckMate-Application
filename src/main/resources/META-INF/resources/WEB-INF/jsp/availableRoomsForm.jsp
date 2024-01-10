<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Room Selection Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }

        .container {
            max-width: 400px;
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
    <h2>Enter Room Details To Check</h2>
    <form action="/getAvailableRooms" method="post">
        <div class="form-group">
            <label for="block">Select Block:</label>
            <select class="form-control" name="block" id="block" onchange="updateRoomOptions()">
                <option value="TBH">TBH</option>
                <option value="Northern">Northern</option>
                <!-- Add more options if needed -->
            </select>
        </div>
        <div class="form-group">
            <label for="roomNumber">Room Number:</label>
            <select class="form-control" id="roomNumber" name="roomNumber">
            </select>
        </div>
        <div class="form-group">
            <label for="day">Select Day:</label>
            <select class="form-control" name="weekDay" id="day">
                <option value="Monday">Monday</option>
                <option value="Tuesday">Tuesday</option>
                <option value="Wednesday">Wednesday</option>
                <option value="Thursday">Thursday</option>
                <option value="Friday">Friday</option>
            </select>
        </div>
        <div class="form-group">
            <label for="time">Select Time:</label>
            <select class="form-control" name="time" id="time">
                <option value="7AM - 10AM">7 AM - 10 AM</option>
                <option value="10AM - 1PM">10 AM - 1 PM</option>
                <option value="1PM - 4PM">1 PM - 4 PM</option>
                <option value="4PM - 6PM">4 PM - 6 PM</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    <a href="availableLTForm" class="btn btn-primary mt-4">Check Lecture Theater (LT)</a>
</div>

<script>
    function updateRoomOptions() {
        var blockSelect = document.getElementById('block');
        var roomNumberSelect = document.getElementById('roomNumber');
        roomNumberSelect.innerHTML = '';

        if (blockSelect.value === 'TBH') {
            for (var i = 1; i <= 9; i++) {
                var option = document.createElement('option');
                option.text = 'TBH' + i;
                option.value = 'TBH' + i;
                roomNumberSelect.appendChild(option);
            }
        } else if (blockSelect.value === 'Northern') {
            for (var i = 1; i <= 12; i++) {
                var option = document.createElement('option');
                option.text = 'N' + i;
                option.value = 'N' + i;
                roomNumberSelect.appendChild(option);
            }
        }
    }

    document.addEventListener('DOMContentLoaded', function() {
        updateRoomOptions();
    });
</script>
</body>
</html>
