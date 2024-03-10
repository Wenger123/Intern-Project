package fleetmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;
import fleetmanagement.dao.DetailsDAO;
import fleetmanagement.dbutil.HibernateUtils;
import fleetmanagement.pojo.Task;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.hibernate.Session;

import java.util.List;

@Action("/viewAllTaskPage")
@Results({
        @Result(name = "success", location = "/viewAllTasks.jsp")
})
public class ViewAllTasks extends ActionSupport {
    private List<Task> taskList;
    public List<Task> getTaskList() {
        return taskList;
    }
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String execute() {
        // Open session
        Session openSession = HibernateUtils.getSessionFactory().openSession();

        // Retrieve the list of task for history
        taskList = new DetailsDAO().getAllDetails();

        // Close session
        openSession.close();

        return SUCCESS;
    }
}
