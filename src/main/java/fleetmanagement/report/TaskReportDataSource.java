package fleetmanagement.report;

import fleetmanagement.pojo.Task;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import java.util.List;

public class TaskReportDataSource implements JRDataSource {

    private List<Task> taskList;
    private int index = -1;


    public TaskReportDataSource(List<Task> taskList) {
        this.taskList = taskList;
    }


    @Override
    public boolean next() throws JRException {
        index++;
        return index < taskList.size();
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {

        Task task = taskList.get(index);

        switch (jrField.getName()) {

            case "id":
                return task.getId();
            case "client":
                return task.getClient();
            case "email":
                return task.getEmail();
            case "startDate":
                return task.getStartDate();
            case "poNumber":
                return task.getPoNumber();
            case "contactName":
                return task.getContactName();
            case "phoneNo":
                return task.getPhoneNo();
            case "endDate":
                return task.getEndDate();
            case "status":
                return task.getStatus();
            case "fileName":
                return task.getFileName();
            default:
                return null;
        }
    }
    public List<Task> getTaskList() {
        return taskList;
    }
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
