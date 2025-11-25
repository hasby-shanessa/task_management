package Models;

import Interfaces.Completable;

public class Task implements Completable {
    private String taskId;
    private String title;
    private String taskDescription;
    private String status;
    private String assignedTo;
    private String projectId;

    public Task(String taskId, String title, String taskDescription){
        this.taskId = taskId;
        this.title = title;
        this.taskDescription = taskDescription;
        this.status = "Created";
        this.assignedTo = "Unassigned";
        this.projectId = null;
    }

    // GETTERS AND SETTERS

    public String getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public boolean isComplete(){
        return status.equals("COMPLETED");
    }
    public void markAsComplete(){
        this.status = status;
    }
    public double getCompletionPercentage(){
        return status.equals("COMPLETED")?100.0:0.0;
    }

    public String toString(){
        return "Task{" + "ID= " + taskId + + '\'' + ", Title='" + title + '\'' + ", Status='" + status + '\'' + ", Assigned='" + assignedTo + '\'' + '}';
    }
}
