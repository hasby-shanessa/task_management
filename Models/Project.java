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

        // ADDING A TASK TO THE PROJECT
    public void addTask(Task task){
        if(taskCount<tasks.length){
            tasks[taskCount]=task;
            task.setProjectId(this.projectId);
            taskCount++;
            System.out.println("Task added successfully");
        } else {
            System.out.println("Unable to add task");
        }
    }

    //GETTING TASK BY ID
    public Task findTaskById(){
        for(int i=0; i<taskCount; i++){
            if(tasks[i].getTaskId().equals(this.projectId)){
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public boolean isComplete(){
        if(taskCount==0){
            return false;
        }
        for(int i = 0; i<taskCount; i++){
            if(!tasks[i].isComplete()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void markAsComplete(){
        for(int i =0; i<taskCount; i++){
            tasks[i].markAsComplete();
        }
        System.out.println("All tasks are complete");
    }

    @Override
    public double getCompletionPercentage(){
        if(taskCount==0){
            return 0.0;
        }
        int completedTasks = 0;
        for(int i = 0; i<taskCount; i++){
            if(tasks[i].isComplete()){
                completedTasks++;
            }
        }
        return ((double)completedTasks / taskCount) * 100.0;
    }

    public abstract void displayProjectDetails();
    public abstract String getProjectSummary();

    @Override
    public String toString() {
        return projectType + " Project{" + "ID='" + projectId + '\'' + ", Name='" + projectName + '\'' + ", Tasks=" + taskCount + ", Complete=" + String.format("%.1f%%", getCompletionPercentage()) + '}';
    }
}
