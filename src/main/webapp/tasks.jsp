<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sx" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- Add necessary imports and styles here -->
<style>
  .container {
    border: 2px solid #000;
    border-radius: 10px;
    padding: 20px;
    overflow: hidden;
  }
</style>

<s:form action="details" method="post" onsubmit="return submitForm();" enctype="multipart/form-data">
  <div class="container" style="width: 90vw; margin-inline: auto; display: flex; justify-content: space-between; align-items: center">
    <div class="left-container" style="margin-inline: auto">
      <div class="formTable">
        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="client">Client*</label>
          <select id="client" name="client" required>
            <option value="">--Select Client--</option>
            <option value="Client 1">Client 1</option>
            <option value="Client 2">Client 2</option>
            <option value="Client 3">Client 3</option>
            <option value="Client 4">Client 4</option>
            <option value="Client 5">Client 5</option>
            <option value="Client 6">Client 6</option>
            <option value="Client 7">Client 7</option>
            <option value="Client 8">Client 8</option>
            <option value="Client 9">Client 9</option>
            <option value="Client 10">Client 10</option>
            <!-- Add more client options as needed -->
          </select>
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="email">Email*</label>
          <input type="email" id="email" name="email" required>
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="startDate">Start Date*</label>
          <input type="date" id="startDate" name="startDate" required>
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="poNumber">PO Number*</label>
          <input type="text" id="poNumber" name="poNumber" required>
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="contactName">Contact Name*</label>
          <input type="text" id="contactName" name="contactName" required>
        </div>
      </div>
    </div>

    <div class="right-container" style="margin-inline: auto">
      <div class="formTable">
        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="phoneNo">Phone Numbers*</label>
          <input type="tel" id="phoneNo" name="phoneNo" required>
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="endDate">End Date*</label>
          <input type="date" id="endDate" name="endDate" required>
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="status">Status*</label>
          <select id="status" name="status" required>
            <option value="">--Select Status--</option>
            <option value="Active">Active</option>
            <option value="Inactive">Inactive</option>
            <!-- Add more status options if needed -->
          </select>
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="fileInput">File*</label>
          <input name="fileInput" type="file" value="Select File" id="fileInput" required />
        </div>

        <div class="form-group" style="display: flex; justify-content: flex-start; gap: 1rem;">
          <label for="fileName">File Name</label>
          <input name="fileName" type="text" id="fileName" required />
        </div>

      </div>
    </div>
    <div style="clear:both;"></div>
  </div>

  <%--<button onclick="submitForm()" style="margin-top: 20px;">Submit</button>--%>
  <s:submit value="Submit"/>
</s:form>
<!-- JavaScript function for form submission -->
<script>
  function submitForm() {
    // Add your form submission logic here
    console.log("Form submitted");
  }
</script>




