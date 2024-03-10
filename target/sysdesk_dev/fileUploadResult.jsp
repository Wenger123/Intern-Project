<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>File Upload Result</title>
  <style>

    .title {
      font-size: 24px;
      font-weight: bold;
      margin-bottom: 20px;
    }
    .result-message {
      margin-bottom: 20px;
    }
    .back-button {
      padding: 10px 15px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
  </style>
</head>
<body>

<div class="container">
  <div class="title">File Upload Result</div>

  <div class="result-message">
    <s:property value="getText('file.upload.success')" />
  </div>

  <form action="welcome.jsp">
    <button type="submit" class="back-button">Back to Welcome Page</button>
  </form>
</div>

</body>
</html>
