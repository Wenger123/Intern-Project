package fleetmanagement.pojo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class HistoryPojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date eventTime;
    private String eventType;  // "CREATE" or "UPDATE"
    private String eventUser;  // User who performed the action
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;


    public HistoryPojo() {
    }

    public HistoryPojo(Task task, Date eventTime, String eventType, String eventUser) {
        this.task = task;
        this.eventTime = eventTime;
        this.eventType = eventType;
        this.eventUser = eventUser;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventUser() {
        return eventUser;
    }

    public void setEventUser(String eventUser) {
        this.eventUser = eventUser;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
