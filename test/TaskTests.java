package test;

import Models.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTests {

    private Task task;

    @BeforeEach
    void setUp() {
        Task.resetIdCounter();
        task = new Task("Test Task", "Description", "Pending");
    }

    //creation tests

    @Test
    @DisplayName("Task should have correct name")
    void testTaskName() {
        assertEquals("Test Task", task.getTaskName());
    }

    @Test
    @DisplayName("Task should have auto-generated ID starting with T")
    void testTaskId() {
        assertTrue(task.getTaskId().startsWith("T"));
        assertEquals("T001", task.getTaskId());
    }

    @Test
    @DisplayName("Second task should have ID T002")
    void testSecondTaskId() {
        Task task2 = new Task("Second Task", "", "Pending");
        assertEquals("T002", task2.getTaskId());
    }


    //Status tests
    @Test
    @DisplayName("Valid status 'In Progress' should be accepted")
    void testValidStatus() {
        assertTrue(task.setStatus("In Progress"));
        assertEquals("In Progress", task.getStatus());
    }

    @Test
    @DisplayName("Invalid status should be rejected")
    void testInvalidStatus() {
        assertFalse(task.setStatus("Done"));
        assertEquals("Pending", task.getStatus());
    }

    //Completion tests
    @Test
    @DisplayName("Pending task should not be complete")
    void testNotComplete() {
        assertFalse(task.isComplete());
    }

    @Test
    @DisplayName("Completed task should be complete")
    void testIsComplete() {
        task.setStatus("Completed");
        assertTrue(task.isComplete());
    }

    @Test
    @DisplayName("markAsComplete should set status to Completed")
    void testMarkAsComplete() {
        task.markAsComplete();
        assertEquals("Completed", task.getStatus());
        assertTrue(task.isComplete());
    }

    @Test
    @DisplayName("Completion percentage should be 0 for Pending")
    void testCompletionZero() {
        assertEquals(0.0, task.getCompletionPercentage());
    }

    @Test
    @DisplayName("Completion percentage should be 100 for Completed")
    void testCompletionHundred() {
        task.setStatus("Completed");
        assertEquals(100.0, task.getCompletionPercentage());
    }

}
