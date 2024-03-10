package fleetmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;
import fleetmanagement.dao.DetailsDAO;
import fleetmanagement.pojo.Task;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


@Results({
        @Result(name = "success", type = "stream", params = {
                "contentType", "image/jpeg",
                "inputName", "fileInputStream",
                "contentDisposition", "attachment;filename=\"${fileName}\"",
                "bufferSize", "1024"
        }),
        @Result(name = "error", location = "/error.jsp")
})
public class DownloadFile extends ActionSupport {

    private Long id;
    private InputStream fileInputStream;
    private String fileName;

    @Action("downloadFileAction")
    public String details() {
        System.out.println("Executing DownloadFile action for id: " + id);

        Task task = DetailsDAO.getDetailById(id);
        System.out.println( "gotten" + id );
        if (task != null) {
            fileInputStream = new ByteArrayInputStream(task.getFileContent());
            fileName = "file";

            System.out.println(task.getFileContent().length);
            System.out.println("prony" + id );
            return "success";
        } else
            return "error";
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(InputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
