<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>LIST OF VEHICLE MAINTENANCE REQUESTS</title>
    <link rel="stylesheet" href="styles.css">

</head>
<body>
<%@ include file="header.jsp" %>


<div>

    <s:form action="requestPage" class="filterPanel">
        <label for="id">Request No.:</label>
        <input type="text" id="id" name="id">

        <label for="office">Office:</label>
        <select id="office" name="office">
            <option value="">-- Select Office --</option>
            <option value="lagos">Lagos</option>
            <option value="abuja">Abuja</option>
            <option value="kano">Kano</option>
            <option value="jos">Jos</option>
            <option value="benin">Benin</option>
        </select>
        <br/>

        <label for="client">Client:</label>
        <select id="client" name="client">
            <option disabled selected value="">-- Select Client --</option>
            <option value="GTB">GTB</option>
            <option value="UBA">UBA</option>
            <option value="union">Union</option>
            <option value="KPMG">KPMG</option>
            <option value="fidelity">Fidelity</option>
        </select>

        <label for="vehicle">Vehicle:</label>
        <select id="vehicle" name="vehicle">
            <option value="">-- Select Vehicle --</option>
            <option value="SUV">SUV</option>
            <option value="saloon">Saloon</option>
            <option value="bus">Bus</option>
            <option value="truck">Truck</option>
            <option value="van">Van</option>
        </select>

        <s:submit value="Search" class="actionBtn"/>
    </s:form>

</div>

<s:if test="requestList != null && !requestList.isEmpty()">

    <table border="1">
        <thead>
        <tr>
            <th>ID</th>
            <th>Office</th>
            <th>Vehicle</th>
            <th>Driver</th>
            <th>Fault Type</th>
            <th>Client</th>
            <th>Millage</th>
            <th>Date</th>
            <th>Time</th>
            <th>Location</th>
            <th>Complaint</th>
            <th>Comment</th>
            <th>Assign</th>
            <th>Notify</th>
            <th colspan="2">Actions</th>

        </tr>
        </thead>
        <tbody>
        <s:iterator value="requestList" var="dr">
            <tr>
                <td><s:property value="#dr.id" /></td>
                <td><s:property value="#dr.office" /></td>
                <td><s:property value="#dr.vehicle" /></td>
                <td><s:property value="#dr.driver" /></td>
                <td><s:property value="#dr.faultType" /></td>
                <td><s:property value="#dr.client" /></td>
                <td><s:property value="#dr.millage" /></td>
                <td><s:property value="#dr.date" /></td>
                <td><s:property value="#dr.time" /></td>
                <td><s:property value="#dr.location" /></td>
                <td><s:property value="#dr.complaint" /></td>
                <td><s:property value="#dr.comment" /></td>
                <td><s:property value="#dr.assign" /></td>
                <td><s:property value="#dr.notify" /></td>

                <td>
                        <%--            <a href="updateDataAction?productId=<s:property value="#product.productId"/>">--%>
                        <%--                <button class="actionBtn">Edit</button>--%>
                        <%--            </a>--%>
                        <%--    <a href="editRequest?id=<s:property value="#dr.id"/>">--%>
                        <%--        <button class="actionBtn">Edit</button>--%>
                        <%--    </a>--%>
                    <a href="editData?id=<s:property value="#dr.id"/>">
                        <button class="actionBtn">Edit</button>
                    </a>

                </td>
                <td>
                        <%--            <a href="deleteAction?productId=<s:property value="#product.productId"/>">--%>
                    <button class="actionBtn">View</button>
                    </a>
                </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
</s:if>

<s:else>
    <div>No results found.</div>
</s:else>


</body>
</html>