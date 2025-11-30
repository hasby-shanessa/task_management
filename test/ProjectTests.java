package test;

import Models.HardwareProject;
import Models.Project;
import Models.SoftwareProject;
import Models.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTests {
    private SoftwareProject softwareProject;
    private HardwareProject hardwareProject;

    @BeforeEach
    void setUp(){
        Project.resetIdCounter();
        Task.resetIdCounter();

        softwareProject = new SoftwareProject("Test Software", "Desc", 5, "$400", "Java", "Spring", "url");
        hardwareProject = new HardwareProject("Test hardware", "Desc", 3, "$4000", "Arduino", "Ard");
    }
    //creation tests
    @Test
    @DisplayName("Software should have a correct type")
    void testSoftwareType(){
        assertEquals("Software", softwareProject.getProjectType());
    }
    @Test
    @DisplayName("Hardware proj should have correct type")
    void testHardwareType(){
        assertEquals("Hardware", hardwareProject.getProjectType());
    }
    @Test
    @DisplayName("Projects should have auto-generated IDs")
    void testProjectIds() {
        assertEquals("P001", softwareProject.getProjectId());
        assertEquals("P002", hardwareProject.getProjectId());
    }

    //task management tests
    @Test
    @DisplayName("addTask should increase task count")
    void testAddTask() {
        Task task = new Task("Task 1", "", "Pending");
        softwareProject.addTask(task);
        assertEquals(1, softwareProject.getTaskCount());
    }

    @Test
    @DisplayName("findTaskById should return correct task")
    void testFindTask() {
        Task task = new Task("Find Me", "", "Pending");
        softwareProject.addTask(task);

        Task found = softwareProject.findTaskById("T001");
        assertEquals("Find Me", found.getTaskName());
    }

    @Test
    @DisplayName("findTaskById should return null if not found")
    void testFindTaskNotFound() {
        assertNull(softwareProject.findTaskById("T999"));
    }

    @Test
    @DisplayName("removeTask should decrease task count")
    void testRemoveTask() {
        softwareProject.addTask(new Task("Task 1", "", "Pending"));
        softwareProject.addTask(new Task("Task 2", "", "Pending"));
        assertEquals(2, softwareProject.getTaskCount());

        softwareProject.removeTask("T001");
        assertEquals(1, softwareProject.getTaskCount());
    }

    //completion tests
    @Test
    @DisplayName("Empty project should not be complete")
    void testEmptyNotComplete() {
        assertFalse(softwareProject.isComplete());
    }

    @Test
    @DisplayName("Project with all completed tasks should be complete")
    void testProjectComplete() {
        softwareProject.addTask(new Task("Task 1", "", "Completed"));
        softwareProject.addTask(new Task("Task 2", "", "Completed"));
        assertTrue(softwareProject.isComplete());
    }

    @Test
    @DisplayName("Completion percentage should calculate correctly")
    void testCompletionPercentage() {
        softwareProject.addTask(new Task("Task 1", "", "Completed"));
        softwareProject.addTask(new Task("Task 2", "", "Pending"));
        assertEquals(50.0, softwareProject.getCompletionPercentage(), 0.01);
    }

    //polymorphism test
    @Test
    @DisplayName("Both types can be treated as Project")
    void testPolymorphism() {
        Project p1 = softwareProject;
        Project p2 = hardwareProject;

        // Same method, different results
        assertEquals("Software", p1.getProjectType());
        assertEquals("Hardware", p2.getProjectType());
    }
}
