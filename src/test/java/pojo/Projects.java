package pojo;

public class Projects {

    private String projectID;
    private String projectName;

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private String status;

    public Projects(String projectID, String projectName, String status){
        this.projectID = projectID;
        this.projectName = projectName;
        this.status = status;
    }



}

