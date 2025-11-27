import Models.HardwareProject;
import Models.Project;
import Models.SoftwareProject;
import Models.Task;
import Services.ProjectService;

public class MainTest {
    public static void main(String[] args){
        ProjectService ps = new ProjectService();

        SoftwareProject sp1 = ps.createSoftwareProject(
                "Alfa Tracker", "Task tracking app for startups", 5, "$15,000", "Java", "SpringBoot", "github.com/alfaTracker"
        );
        HardwareProject hp1 = ps.createHardwareProject("IoT Sensor Kit", "Sensor prototype for smart devices", 3, "$10,000", "Arduino", "Arduino");

        SoftwareProject sp2 = ps.createSoftwareProject("Software 2", "Second software project", 3, "0", "Python", "Flutter", "flutter.com");

        sp1.addTask(new Task("Design database"));
        sp1.addTask(new Task("Implement API", "REST design", "High"));
        hp1.addTask(new Task("Setup environment"));

        System.out.println("Project counts");
        System.out.println("Total: "+ ps.getProjectCount());
        System.out.println("Software projects: " + ps.getSoftwareProjectCount());
        System.out.println("Hardware projects: " + ps.getHardwareProjectCount());

        System.out.println("Find by id");
        Project find = ps.findProjectById("P001");
        Project find2 = ps.findProjectById("P002");
        System.out.println("Found P001: " +(find !=null ? find.getProjectName() : "Not found"));
        System.out.println("Found P002: " +(find2 !=null ? find2.getProjectName() : "Not found"));

        System.out.println("Update task status");
        sp1.updateTaskStatus("T001", "COMPLETED");

        System.out.println("Project details");
        sp1.displayProjectDetails();
        hp1.displayProjectDetails();
//        hp1.displayTasks();

        System.out.println("stats");
        System.out.println("Average completion: "+ ps.getAverageCompletion() + "%");
        System.out.println("Total tasks: " + ps.getTotalTaskCount());
        System.out.println("Completed tasks: " + ps.getCompletedTaskCount());
        System.out.println("Completed projects: " + ps.getCompletedProjectCount());

    }
}
