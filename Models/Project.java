package Models;

public class Project {
    private static int IdCounter = 1;
    private String projectId;
    private String projectName;
    private String projectDescription;
    public enum projectType{
        SOFTWARE,
        HARDWARE
    }
    private projectType projectType;
    private int teamSize;
    private double budget;
    private String status;

    public Project(String projectName, String projectDescription, projectType projectType, int teamSize, double budget){
        this.projectId = String.format("P%03d", IdCounter++);
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectType = projectType;
        this.teamSize = teamSize;
        this.budget = budget;
        this.status = "Created";
    }

    // Getters to help return values of our strings

    public String getProjectId(){
        return projectId;
    }
    public String getProjectName(){
        return projectName;
    }
    public String getProjectDescription(){
        return projectDescription;
    }
    public projectType getProjectType(){
        return projectType;
    }
    public int getTeamSize(){
        return teamSize;
    }
    public double getBudget(){
        return budget;
    }
    public String status(){
        return status;
    }

    // status setter to help update our project's status

    public void setStatus(String status){
        this.status = status;
    }

//    public static void addProject(Models.Project project){}

//    public Models.Project()
}
