<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>ViewAllTasks</h1>

    <table border="1">
        <thead>
        <tr>
            <th>#</th>
            <th>Client</th>
            <th>Contact Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Start Date</th>
            <th>PO Number</th>
            <th>End Date</th>
            <th>Status</th>
            <th>File</th>
            <th>Edit</th>
            <th>History</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="taskList">
            <tr>
                <td><s:property value="id" /></td>
                <td><s:property value="client" /></td>
                <td><s:property value="contactName" /></td>
                <td><s:property value="email" /></td>
                <td><s:property value="phoneNo" /></td>
                <td><s:property value="startDate" /></td>
                <td><s:property value="poNumber" /></td>
                <td><s:property value="endDate" /></td>
                <td><s:property value="status" /></td>
                <td>
                    <s:url var="downloadUrl" action="downloadFileAction">
                        <s:param name="id"><s:property value="id"/></s:param>
                    </s:url>
                    <s:a href="%{downloadUrl}">
                        <s:property value="fileName"/>
                    </s:a>
                </td>
                <td>
                    <a href="editTask?id=<s:property value="id"/>">
                        <button>Edit</button>
                    </a>
                </td>
                <td>
                    <a href="history?id=<s:property value="id"/>">
                        <button class="actionBtn">History</button>
                    </a>
                </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>

    <div>
        <a href="welcome.jsp">
            <button>Back Welcome</button>
        </a>
    </div>

    <s:form action="generatePdfAction">
        <s:submit value="Generate Report"/>
    </s:form>
</body>
</html>