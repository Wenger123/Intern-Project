package fleetmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;
import fleetmanagement.dao.HistoryDAO;
import fleetmanagement.pojo.HistoryPojo;
import fleetmanagement.pojo.Task;
import fleetmanagement.dao.DetailsDAO;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

@Action("/details")
@Results({
        @Result(name = "success", location = "/success.jsp"),
        @Result(name = "error", location = "/error.jsp")
})
public class AddDetails extends ActionSupport {
    private Long id;
    private String client;
    private String email;
    private String startDate;
    private String poNumber;
    private String contactName;
    private String phoneNo;
    private String endDate;
    private String status;
    private File fileInput;
    private String fileName;

    public String execute() {

        try {
            byte[] file = new byte[0];

            try (InputStream inputStream = new FileInputStream(fileInput)) {
                System.out.println("file upload started");
                file = new byte[(int)fileInput.length()];
                inputStream.read(file);
                System.out.println("file upload success");
            } catch (Exception e) {
                System.out.println("upload file error");
                e.printStackTrace();
            }

            // Create a Task object with the form data
            Task task = new Task();
            task.setClient(client);
            task.setEmail(email);
            task.setStartDate(startDate);
            task.setPoNumber(poNumber);
            task.setContactName(contactName);
            task.setPhoneNo(phoneNo);
            task.setEndDate(endDate);
            task.setStatus(status);
            task.setFileContent(file);
            task.setFileName(fileName);

            // Save the task using DetailsDAO
            DetailsDAO detailsDAO = new DetailsDAO();
            detailsDAO.saveDetails(task);

            String user = ServletActionContext.getRequest().getSession().getAttribute("loggedInUser").toString();

            HistoryPojo historyPojo = new HistoryPojo(
                    task, new Date(), "create" , user
            );

            new HistoryDAO().addHistoryEvent(task.getId(), historyPojo);

            addActionMessage("Task created successfully.");

            return "success";
        } catch (Exception e) {
            // Log any errors or exceptions
            e.printStackTrace();
            return "error";
        }
    }

    // Getters and setters for properties
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public File getFileInput() {
        return fileInput;
    }

    public void setFileInput(File fileInput) {
        this.fileInput = fileInput;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFileName() {return fileName;}

    public void setFileName(String fileName) {this.fileName = fileName;}
}

