<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 13/02/2024
  Time: 07:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container">
    <button onclick="openAddDocumentPage()">Add Document</button>
</div>

<!-- JavaScript function to open the Add Document page -->
<script>
    function openAddDocumentPage() {
        window.location.href = "addDocument.jsp"; // Replace "addDocument.jsp" with the URL of the page where users can add documents
    }
</script>

<!-- Submit button -->
<div class="container">
    <form action="submitForm.jsp" method="post"> <!-- Update the action and method as needed -->
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>



