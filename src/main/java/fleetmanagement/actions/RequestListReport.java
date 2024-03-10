package fleetmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;
import fleetmanagement.dao.DetailsDAO;
import fleetmanagement.dbutil.HibernateUtils;
import fleetmanagement.pojo.Task;
import fleetmanagement.report.TaskReportDataSource;
import net.sf.jasperreports.engine.*;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.hibernate.Session;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

@Action("/generatePdfAction")
@Results({
        @Result(name = "error", location = "/error.jsp")
})
public class RequestListReport extends ActionSupport {

    public String execute() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            List<Task> taskList = new DetailsDAO().getAllDetails();

            TaskReportDataSource dataSource = new TaskReportDataSource(taskList);

            InputStream templateStream = getClass().getResourceAsStream("/newRequestReport.jrxml");

            if (templateStream != null) {
                JasperReport jasperReport = JasperCompileManager.compileReport(templateStream);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

                HttpServletResponse response = ServletActionContext.getResponse();
                response.setContentType("application/pdf");
                response.setHeader("Content-Disposition", "attachment;filename=list_of_tasks.pdf");

                JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());

                return "none";
            }else{
                System.out.println("templateStream is null");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }
}