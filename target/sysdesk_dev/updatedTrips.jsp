<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sx" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title></title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="container">
  <div class="topnav">
    <a href="#" class="active">Home</a>
    <!-- Add more navigation links if needed -->
  </div>


  <div class="formTable">
    <div class="form-group">
      <div>
        <button onclick="showDetails()">DETAILS</button>
      </div>
      <div>
        <button onclick="showFile()">FILE</button>
      </div>
      <div>
        <s:a action="historyPage"><button>Show History</button></s:a>
      </div>
    </div>

    <s:form action="trips">
      <div class="formTable">
        <h2>New Trip</h2>

        <!-- Form Group 1 -->
        <div class="form-group">
          <label for="passengerNames" class="required">Passenger Name(s)</label>
          <input type="text" id="passengerNames" name="passengerNames" class="form-field" required>

          <label for="passengerDetails" class="required">No Of Passenger / Phone / Email</label>
          <div class="form-group">
            <input type="number" id="numberOfPassengers" name="numberOfPassengers" class="form-field-small" required>
            <input type="tel" id="phone" name="phone" class="form-field" required>
            <input type="email" id="email" name="email" class="form-field" required>
          </div>
        </div>

        <!-- Form Group 2 -->
        <div class="form-group">
          <label for="departure" class="required">Departure</label>
          <input type="text" id="departure" name="departure" required>

          <label for="destination" class="required">Destination/Possible stops</label>
          <input type="text" id="destination" name="destination" required>
        </div>

        <!-- Form Group 3 -->
        <div class="form-group">
          <label for="pickUpDate" class="required">Pick Up Date</label>
          <input type="date" id="pickUpDate" name="pickUpDate" required>

          <label for="pickUpTime">Select time</label>
          <input type="time" id="pickUpTime" name="pickUpTime">

          <label for="endDate">End Date</label>
          <input type="date" id="endDate" name="endDate">

          <label for="endTime">Select time</label>
          <input type="time" id="endTime" name="endTime">
        </div>

        <!-- Form Group 4 -->
        <div class="form-group">
          <label for="vehicleCategory" class="required">Vehicle Category</label>
          <input type="text" id="vehicleCategory" name="vehicleCategory" required>

          <label for="vehicleType" class="required">Vehicle Type</label>
          <select id="vehicleType" name="vehicleType">
            <option value="--Select Type--">--Select Type--</option>
            <!-- Add vehicle type options dynamically if needed -->
            <option value="pool"> Pool </option>
            <option value="status"> Status </option>
            <option value="third party"> Third Party </option>
          </select>
        </div>

        <!-- Form Group 5 -->
        <div class="form-group">
          <label for="serviceType" class="required">Service Type</label>
          <select id="serviceType" name="serviceType">
            <option value="Pool Vehicle">Pool Vehicle</option>
            <option value="Ride Hailing">Ride Hailing</option>
            <!-- Add more service types if needed -->
          </select>

          <label for="additionalServices">Additional Service(s)</label>
          <input type="text" id="additionalServices" name="additionalServices">
        </div>

        <!-- Form Group 6 -->
        <div class="form-group">
          <label for="numberOfDays">No Of Day(s)</label>
          <input type="number" id="numberOfDays" name="numberOfDays" oninput="calculateTotalAmount()">

          <label for="pricePerDay">Price Per Day</label>
          <input type="number" id="pricePerDay" name="pricePerDay" oninput="calculateTotalAmount()">
        </div>

        <!-- Add other form groups as needed -->

        <!-- Additional Information Textarea -->
        <label for="additionalInformation" class="required">Additional Information</label>
        <textarea id="additionalInformation" name="additionalInformation"></textarea>

        <!-- Form Group 7 -->
        <div class="form-group">
          <label for="personnelType" class="required">Personnel</label>
          <select id="personnelType" name="personnelType">
            <option value="--Select Type--">--Select Type--</option>
            <!-- Add personnel type options dynamically if needed -->
            <option value="driver"> Driver </option>
            <option value="battery charger"> Battery Charger </option>
            <option value="electrician"> Electrician </option>
            <option value="mechanic"> Mechanic </option>
            <option value="painter"> Painter </option>
            <option value="panel beater"> Panel beater </option>
            <option value="screen painter"> Screen Painter </option>d
          </select>

          <label for="personnelName" class="required">Personnel Name</label>
          <select id="personnelName" name="personnelName">
            <option value="--Select Personnel--">--Select Personnel--</option>
            <!-- Add personnel options dynamically if needed -->
            <option value="dele momodu"> Dele Momodu </option>
            <option value="jide adeyemi"> Jide Adeyemi </option>
            <option value="kayode ajibade"> Kayode Ajibade </option>
          </select>
        </div>

        <br>

        <label for="vehicle" class="required">Vehicle</label>
        <select id="vehicle" name="vehicle">
          <option value="--Select Vehicle--">--Select Vehicle--</option>
          <!-- Add vehicle options dynamically if needed -->
        </select>


        <!-- Form Group 8 -->
        <div class="form-group">
          <label for="resourceAvailability">Is Resource Available</label>
          <input type="checkbox" id="resourceAvailability" name="resourceAvailability">

        </div>

        <br>

        <label for="totalAmount">Total Amount</label>
        <input type="text" id="totalAmount" name="totalAmount" readonly>

        <h3>Added Trip(s)</h3>
        <s:if test="addedTripsList != null && !addedTripsList.isEmpty()">
          <table border="1">
            <!-- Add table headers and iterate through addedTripsList -->
            <thead>
            <!-- Add table headers -->
            <tr>
              <th>#</th>
              <th>Passenger Name</th>
              <th>Pick Up Date</th>
              <th>End Date</th>
              <th>Departure</th>
              <th>Destination</th>
              <th>Vehicle Type</th>
              <th>Service Type</th>
              <th>Total Amount</th>
              <th>Resource</th>
              <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="addedTripsList" var="addedTrip">
              <tr>
                <!-- Add table data cells for each property of TripsPojo -->
                <td><s:property value="#addedTrip.id" /></td>
                <td><s:property value="#addedTrip.passengerNames" /></td>
                <td><s:property value="#addedTrip.pickUpDate + ' ' + #addedTrip.pickUpTime" /></td>
                <td><s:property value="#addedTrip.endDate + ' ' + #addedTrip.endTime" /></td>
                <td><s:property value="#addedTrip.departure" /></td>
                <td><s:property value="#addedTrip.destination" /></td>
                <td><s:property value="#addedTrip.vehicleType" /></td>
                <td><s:property value="#addedTrip.serviceType" /></td>
                <td><s:property value="#addedTrip.totalAmount" /></td>
                <td><s:property value="#addedTrip.resourceAvailability" /></td>
                <td>
                  <a href="editData?id=<s:property value='#addedTrip.id'/>">
                    <button>Edit</button>
                  </a>
                </td>
              </tr>
            </s:iterator>
            </tbody>
          </table>
        </s:if>

        <s:else>
          <div>No trips added.</div>
        </s:else>

        <button type="submit">Submit</button>
      </div>
    </s:form>

    <div id="detailsSection" style="display: none;">
      <jsp:include page="detail.jsp" />
    </div>

    <div id="fileSection" style="display: none;">
      <jsp:include page="file.jsp" />
    </div>

    <div id="historySection" style="display: none;">
      <jsp:include page="history.jsp" />
    </div>


  </div>
</div>

<script>

  function calculateTotalAmount() {
    var numberOfDays = parseFloat(document.getElementById("numberOfDays").value) || 0;
    var pricePerDay = parseFloat(document.getElementById("pricePerDay").value) || 0;
    var totalAmountField = document.getElementById("totalAmount");

    // Perform the calculation and set the value to the totalAmount field
    totalAmountField.value = (numberOfDays * pricePerDay).toFixed(2);
  }

  function showDetails() {
    document.getElementById("detailsSection").style.display = "block";
    document.getElementById("fileSection").style.display = "none";
    document.getElementById("historySection").style.display = "none";
  }

  function showFile() {
    document.getElementById("detailsSection").style.display = "none";
    document.getElementById("fileSection").style.display = "block";
    document.getElementById("historySection").style.display = "none";
  }

  function showHistory() {
    document.getElementById("detailsSection").style.display = "none";
    document.getElementById("fileSection").style.display = "none";
    document.getElementById("historySection").style.display = "block";
  }
</script>
</body>
</html>
