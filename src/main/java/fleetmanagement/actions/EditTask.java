package fleetmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;
import fleetmanagement.dao.DetailsDAO;
import fleetmanagement.pojo.Task;
import jakarta.persistence.Lob;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Action("/editTask")
@Results({
        @Result(name = "success", location = "/editRequest.jsp"),
        @Result(name = "error", location = "/error.jsp")
})
public class EditTask extends ActionSupport {

    private Long id;
    private String client;
    private String email;
    private String startDate;
    private String poNumber;
    private String contactName;
    private String phoneNo;
    private String endDate;
    private String status;
    private String fileName;
    private byte[] fileInput;
    private DetailsDAO detailsDAO = new DetailsDAO();

    public String execute() {


        // Load the task from the database using the ID
        Task task = DetailsDAO.getDetailById(id);

        if (task != null) {
            // Set fields based on the loaded task
            id = task.getId();
            client = task.getClient();
            email = task.getEmail();
            startDate = task.getStartDate();
            poNumber = task.getPoNumber();
            contactName = task.getContactName();
            phoneNo = task.getPhoneNo();
            endDate = task.getEndDate();
            status = task.getStatus();
            fileName = task.getFileName();
            fileInput = task.getFileContent();

            return "success";

        } else {
            // Handle the case where the task with the specified ID is not found
            System.out.println("Executing EditTask action for ID: " + id);

            return ERROR;
        }
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileContent() {
        return fileInput;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileInput = fileContent;
    }
}
