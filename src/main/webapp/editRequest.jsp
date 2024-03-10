<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Edit Task</title>
  <!-- Add your CSS styles or link to an external stylesheet here -->
</head>
<body>

<%@ include file="header.jsp" %>

<h2>Edit Task</h2>

<s:form action="/updateTask" id="task" enctype="multipart/form-data" method="post">
  <s:hidden name="id" value="%{id}" />

  <s:select name="client" label="Client" list="#{'':'--Select Type--', 'Client 1':'Client 1', 'Client 2':'Client 2', 'Client 3':'Client 3'}" value="%{client}" />

  <s:textfield name="email" label="Email" value="%{email}" />

  <s:textfield name="startDate" label="Start Date" value="%{startDate}" />

  <s:textfield name="poNumber" label="PO Number" value="%{poNumber}" />

  <s:textfield name="contactName" label="Contact Name" value="%{contactName}" />

  <s:textfield name="phoneNo" label="Phone Number" value="%{phoneNo}" />

  <s:textfield name="endDate" label="End Date" value="%{endDate}" />

  <s:select name="status" label="Status" list="#{'':'--Select Status--', 'Active':'Active', 'Inactive':'Inactive'}" value="%{status}" />

  <s:file name="fileInput" label="Select File" value="%{fileInput}" />

  <s:textfield name="fileName" label="File Name" value="%{fileName}" />

  <s:submit value="Update" />
</s:form>

<div>
  <a href="viewAllTasks.jsp">
    <button>Back Welcome</button>
  </a>
</div>
<!-- Add your additional HTML, JavaScript, or other content here -->

</body>
</html>
