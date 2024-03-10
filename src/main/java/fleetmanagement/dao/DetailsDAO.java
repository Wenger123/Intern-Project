package fleetmanagement.dao;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import fleetmanagement.dbutil.HibernateUtils;
import fleetmanagement.pojo.DetailsPojo;
import fleetmanagement.pojo.Task;
import jakarta.persistence.Lob;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.File;
import java.util.List;

public class DetailsDAO {

    // Example log statement in a DAO class
    private static final Logger log = LoggerFactory.getLogger(DetailsDAO.class);

    public void saveDetails(Task details) {

        try {
            log.info("Opening session...");
            Session session = HibernateUtils.getSessionFactory().openSession();
            log.info("Session opened successfully.");

            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();
                // Perform database operations
                session.save(details);

                transaction.commit();
            } catch (Exception e) {
                log.error("Error during transaction.", e);
                if (transaction != null) {
                    transaction.rollback();
                }
            } finally {
                log.info("Closing session...");
                session.close();
                log.info("Session closed.");
            }
        } catch (Exception e) {
            log.error("Error opening session.", e);
        }

    }

    public List<Task> getAllDetails() {
        List<Task> detailsList = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Task";
            Query<Task> query = session.createQuery(hql, Task.class);
            detailsList = query.getResultList();
        } catch (HibernateException e) {
            log.error("Error fetching details from database ", e);
        }
        return detailsList;
    }

    public static Task getDetailById(Long id) {
        Task task;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            String hql = "FROM Task WHERE id = :id";
            Query<Task> query = session.createQuery(hql, Task.class);
            query.setParameter("id", id);
            task = query.uniqueResult();
            System.out.println(task.getContactName());
        } catch (Exception e) {
            throw new RuntimeException("Error fetching product by ID", e);
        }
        return task;
    }


    public static int updateDetails(Task updatedTask) {
        int stat = 0;

        try {
            log.info("Opening session for update...");
            Session session = HibernateUtils.getSessionFactory().openSession();
            log.info("Update Session opened successfully.");

            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                // database operations
                Task existingTask = session.load(Task.class, updatedTask.getId());

                existingTask.setClient(updatedTask.getClient());
                existingTask.setEmail(updatedTask.getEmail());
                existingTask.setStartDate(updatedTask.getStartDate());
                existingTask.setPoNumber(updatedTask.getPoNumber());
                existingTask.setContactName(updatedTask.getContactName());
                existingTask.setPhoneNo(updatedTask.getPhoneNo());
                existingTask.setEndDate(updatedTask.getEndDate());
                existingTask.setStatus(updatedTask.getStatus());
                existingTask.setFileName(updatedTask.getFileName());
                existingTask.setFileContent(updatedTask.getFileContent());

                session.update(existingTask);

                transaction.commit();
            } catch (Exception e) {
                log.error("Error during transaction Update.", e);
                if (transaction != null) {
                    transaction.rollback();
                }
            } finally {
                log.info("Closing session...");
                session.close();
                log.info("Session closed.");
            }
        } catch (Exception e) {
            log.error("Error opening session.", e);
        }

        return stat;
    }
}
