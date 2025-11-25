package Models;

import Interfaces.Completable;

public abstract class Project implements Completable {
    protected String projectId;
    protected String projectName;
    protected String projectDescription;
    protected String projectType;
    protected Task[] tasks;
    protected int taskCount;

    public Project(String projectId, String projectName, String projectDescription, String projectType){
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectType = projectType;
        this.tasks = new Task [taskCount];
        this.taskCount = 0;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getProjectType() {
        return projectType;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }


}
