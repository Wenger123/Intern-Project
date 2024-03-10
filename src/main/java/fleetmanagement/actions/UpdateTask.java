package fleetmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;
import fleetmanagement.dao.DetailsDAO;
import fleetmanagement.dao.HistoryDAO;
import fleetmanagement.pojo.HistoryPojo;
import fleetmanagement.pojo.Task;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Action(value = "/updateTask", results = {
        @Result(name = "success", location = "/success.jsp"),
        @Result(name = "input", type = "redirectAction", params = {"actionName", "viewAllTaskPage"}),
        @Result(name = "error",location = "/error.jsp"),
})
public class UpdateTask extends ActionSupport {

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
    private File fileInput;
    private byte[] fileContent;
    private DetailsDAO detailsDAO = new DetailsDAO();

    public String execute() throws IOException {

        try {

            if (id != null) {
                Task task = DetailsDAO.getDetailById(id);

                task.setClient(client);
                task.setEmail(email);
                task.setStartDate(startDate);
                task.setPoNumber(poNumber);
                task.setContactName(contactName);
                task.setPhoneNo(phoneNo);
                task.setEndDate(endDate);
                task.setStatus(status);
                task.setFileName(fileName);
                task.setClient(client);

                if (fileInput != null) {
                    byte[] file;

                    try (InputStream inputStream = new FileInputStream(fileInput)) {
                        System.out.println("file upload started");
                        file = new byte[(int)fileInput.length()];
                        inputStream.read(file);

                        task.setFileContent(file);

                        System.out.println("file upload success");
                    } catch (Exception e) {
                        System.out.println("upload file error");
                        e.printStackTrace();
                    }
                }

                int recordUpdated = DetailsDAO.updateDetails(task);

                String user = ServletActionContext.getRequest().getSession().getAttribute("loggedInUser").toString();

                HistoryPojo historyPojo = new HistoryPojo(
                        task, new Date(), "update" , user
                );

                new HistoryDAO().addHistoryEvent(task.getId(), historyPojo);

                if (recordUpdated > 0) {
                    return SUCCESS;
                } else {
                    addActionError("Failed to update trip. Please try again.");
                    return INPUT;
                }
            } else {
                addActionError("Invalid data for updating trip.");
                return INPUT;
            }
        } catch (Exception e) {
            addActionError("An error occurred while updating the trip. Please try again.");
            return INPUT;
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

    public File getFileInput() {
        return fileInput;
    }

    public void setFileInput(File fileInput) {
        this.fileInput = fileInput;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }
}
