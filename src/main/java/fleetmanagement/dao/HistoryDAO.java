package fleetmanagement.dao;

import fleetmanagement.dbutil.HibernateUtils;
import fleetmanagement.pojo.HistoryPojo;
import fleetmanagement.pojo.Task;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HistoryDAO {

    public void addHistoryEvent(Long taskId, HistoryPojo historyEvent) {
        try {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();

                Task task = session.get(Task.class, taskId);

                if (task != null) {
                    historyEvent.setTask(task);
                    session.persist(historyEvent);
                }

                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace(); // Handle the exception appropriately
            } finally {
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    public List<HistoryPojo> getHistoryForTask(Long taskId) {
        List<HistoryPojo> historyList = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            String hql = "FROM HistoryPojo WHERE task.id = :taskId";

            Query<HistoryPojo> query = session.createQuery(hql, HistoryPojo.class);
            query.setParameter("taskId", taskId);

            historyList = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

        return historyList;
    }
}
