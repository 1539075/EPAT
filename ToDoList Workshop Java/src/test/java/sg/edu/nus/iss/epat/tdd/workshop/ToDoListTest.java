package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToDoListTest  {
    // Define Test Fixtures
    private ToDoList toDoList;
    private Task task;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        this.toDoList = new ToDoList();
        this.task=new Task("test",false);
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
        this.toDoList = null;
    }

    @Test
    public void testAddTask() {
//        fail("Not implemented yet");
        toDoList.addTask(task);
        task=toDoList.getTask("test");
        assertEquals(task,task);

    }

    @Test
    public void testGetStatus() {
//        fail("Not implemented yet");
        toDoList.addTask(task);
        toDoList.getStatus(task.getDescription());
        task=toDoList.getTask("test");
        assertEquals(task.isComplete(),false);
        task.setComplete(true);
        assertEquals(task.isComplete(),true);
    }

    @Test
    public void testRemoveTask() {
//        fail("Not implemented yet");
        toDoList.addTask(task);
        task=toDoList.getTask("test");
        toDoList.removeTask(task.getDescription());
        assertEquals(toDoList.getTask("test"),null);
    }

    @Test
    public void testGetCompletedTasks() {
        fail("Not implemented yet");
    }
}