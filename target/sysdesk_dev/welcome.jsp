<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sx" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div style="border: 2px solid #000; border-radius: 10px; padding: 20px; overflow: hidden; text-align: center;">
    <div class="topnav" style="margin-bottom: 20px;">
        <a href="#" class="active">Home</a>
        <!-- Add more navigation links if needed -->
    </div>

    <h2>Welcome, Page</h2>

    <div class="formTable" style="display: flex; justify-content: space-around;">
        <div style="margin-bottom: 10px;">
            <button onclick="showTasks()">DETAILS</button>
        </div>
        <div style="margin-bottom: 10px;">
            <button onclick="showTrips()">TRIPS</button>
        </div>
        <div style="margin-bottom: 10px;">
            <button onclick="showDocuments()">DOCUMENTS</button>
        </div>
        <div>
            <s:a action="viewAllTaskPage"><button>VIEW ALL TASKS</button></s:a>
        </div>
    </div>

    <div id="tasksSection" style="display: none;">
        <jsp:include page="tasks.jsp" />
    </div>

    <div id="tripsSection" style="display: none;">
        <jsp:include page="trip.jsp" />
    </div>

    <div id="documentsSection" style="display: none;">
        <jsp:include page="document.jsp" />
    </div>

    <div id="historySection" style="display: none;">
        <jsp:include page="viewAllTasks.jsp"/>
    </div>
</div>

<script>
    function showTasks() {
        hideAllSections();
        document.getElementById("tasksSection").style.display = "block";
    }

    function showTrips() {
        hideAllSections();
        document.getElementById("tripsSection").style.display = "block";
    }

    function showDocuments() {
        hideAllSections();
        document.getElementById("documentsSection").style.display = "block";
    }

    function showHistory() {
        hideAllSections();
        document.getElementById("historySection").style.display = "block";
    }

    function hideAllSections() {
        document.getElementById("tasksSection").style.display = "none";
        document.getElementById("tripsSection").style.display = "none";
        document.getElementById("documentsSection").style.display = "none";
        document.getElementById("historySection").style.display = "none";
    }
</script>

</body>
</html>



