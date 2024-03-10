package fleetmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;
import fleetmanagement.dao.HistoryDAO;
import fleetmanagement.pojo.HistoryPojo;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.util.List;

@Action("/history")
@Results({
        @Result(name = "success", location = "/history.jsp"),
        @Result(name = "error", location = "/error.jsp")
})
public class HistoryAction extends ActionSupport {

    private Long id;
    private List<HistoryPojo> historyList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<HistoryPojo> getHistoryList() {
        return historyList;
    }

    @Override
    public String execute() throws Exception {
        // Fetch history for the specified tripId
        historyList = new HistoryDAO().getHistoryForTask(id);

        // Return the result string to be used by Struts
        return SUCCESS;
    }
}
