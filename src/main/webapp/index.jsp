<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dinchak Event Management</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f7fc;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            padding: 20px;
        }

        .container {
            width: 100%;
            max-width: 800px;
            background: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            padding: 30px;
            text-align: center;
        }

        h1 {
            color: #333;
            font-size: 36px;
            font-weight: 600;
            margin-bottom: 30px;
        }

        .btn-container {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .btn {
            padding: 15px 30px;
            font-size: 18px;
            font-weight: 500;
            border-radius: 5px;
            border: none;
            cursor: pointer;
            transition: all 0.3s ease;
            display: inline-block;
            width: 100%;
            text-transform: uppercase;
            letter-spacing: 1px;
        }

        .create-btn {
            background-color: #28a745;
            color: white;
        }

        .create-btn:hover {
            background-color: #218838;
            transform: translateY(-2px);
        }

        .view-btn {
            background-color: #007bff;
            color: white;
        }

        .view-btn:hover {
            background-color: #0056b3;
            transform: translateY(-2px);
        }

        .update-btn {
            background-color: #ffc107;
            color: white;
        }

        .update-btn:hover {
            background-color: #e0a800;
            transform: translateY(-2px);
        }

        .delete-btn {
            background-color: #dc3545;
            color: white;
        }

        .delete-btn:hover {
            background-color: #c82333;
            transform: translateY(-2px);
        }

        /* Responsive Design */
        @media (max-width: 600px) {
            .container {
                padding: 20px;
            }

            .btn {
                font-size: 16px;
                padding: 12px 25px;
            }

            h1 {
                font-size: 28px;
            }
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Event Management</h1>
    
    <div class="btn-container">
        <!-- Button for creating an event -->
        <form action="createEvent" method="get">
            <button type="submit" class="btn create-btn">Create Event</button>
        </form>

        <!-- Button for viewing all events -->
        <form action="findEvent.jsp" method="get">
            <button type="submit" class="btn view-btn">Find Event</button>
        </form>

        <!-- Button for updating an event -->
        <form action="findUpdateEvent.jsp" method="get">
            <button type="submit" class="btn update-btn">Update Event</button>
        </form>

        <!-- Button for deleting an event -->
        <form action="deleteEvent" method="get">
            <button type="submit" class="btn delete-btn">Delete Event</button>
        </form>
        
    </div>
</div>

</body>
</html>
