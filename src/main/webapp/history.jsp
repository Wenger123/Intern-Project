<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Task History</title>
  <!-- Add your CSS styles or link to an external stylesheet here -->
</head>
<body>

<%@ include file="header.jsp" %>

<h2>Task History</h2>

  <table border="1">
    <thead>
    <tr>
      <th>#</th>
      <th>Event Time</th>
      <th>Event Type</th>
      <th>Event User</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="historyList">
      <tr>
        <td><s:property value="id" /></td>
        <td><s:property value="eventTime" /></td>
        <td><s:property value="eventType" /></td>
        <td><s:property value="eventUser" /></td>
      </tr>
    </s:iterator>
    </tbody>
  </table>

<div>
  <a href="viewAllTasks.jsp">
    <button>Back ViewAllTasks</button>
  </a>
</div>

<!-- Add your additional HTML, JavaScript, or other content here -->

</body>
</html>
