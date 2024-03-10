package fleetmanagement.pojo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "details")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Lob
    private byte[] fileContent;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private Set<HistoryPojo> historyPojoData;

    public Task(Long id, String client, String email, String startDate, String poNumber,
                String contactName, String phoneNo, String endDate, String status, String fileName,
                byte[] fileContent) {
        this.id = id;
        this.client = client;
        this.email = email;
        this.startDate = startDate;
        this.poNumber = poNumber;
        this.contactName = contactName;
        this.phoneNo = phoneNo;
        this.endDate = endDate;
        this.status = status;
        this.fileName = fileName;
        this.fileContent = fileContent;
        this.historyPojoData = new HashSet<>();
    }

    public Task() {}

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
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public Set<HistoryPojo> getHistoryPojoData() {
        return historyPojoData;
    }

    public void setHistoryPojoData(Set<HistoryPojo> historyPojoData) {
        this.historyPojoData = historyPojoData;
    }
}
