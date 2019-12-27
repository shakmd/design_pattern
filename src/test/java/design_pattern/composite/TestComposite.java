package design_pattern.composite;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestComposite {
    @Test
    public void testLeafGetHtml() {
        TodoList todo = new Todo("I am a leaf");
        Assert.assertEquals("I am a leaf", todo.getHtml());
    }

    @Test
    public void testSimpleCompositeGetHtml() {
        List<TodoList> taskList = new ArrayList<>();
        taskList.add(new Todo("I am task A"));
        taskList.add(new Todo("I am task B"));
        taskList.add(new Todo("I am task C"));

        TodoList project = new Project("This is a collection of todo", taskList);

        StringBuilder expectedHtml = new StringBuilder("This is a collection of todo");
        expectedHtml.append("<ul>");
        expectedHtml.append("<li>" + "I am task A" + "</li>");
        expectedHtml.append("<li>" + "I am task B" + "</li>");
        expectedHtml.append("<li>" + "I am task C" + "</li>");
        expectedHtml.append("</ul>");

        Assert.assertEquals(expectedHtml.toString(), project.getHtml());
    }

    @Test
    public void testComplexCompositeGetHtml() {
        List<TodoList> taskList = new ArrayList<>();
        taskList.add(new Todo("I am task A"));
        taskList.add(new Todo("I am task B"));
        taskList.add(new Todo("I am task C"));

        List<TodoList> parentTaskList = new ArrayList<>();
        parentTaskList.add(new Project("This is a collection of todo", taskList));
        parentTaskList.add(new Todo("I am task D"));
        parentTaskList.add(new Todo("I am task E"));

        TodoList parentProject = new Project("This is a collection of todo and a project", parentTaskList);

        StringBuilder expectedHtml = new StringBuilder("This is a collection of todo and a project");
        expectedHtml.append("<ul>");
        expectedHtml.append("<li>");
        expectedHtml.append("This is a collection of todo");
        expectedHtml.append("<ul>");
        expectedHtml.append("<li>" + "I am task A" + "</li>");
        expectedHtml.append("<li>" + "I am task B" + "</li>");
        expectedHtml.append("<li>" + "I am task C" + "</li>");
        expectedHtml.append("</ul>");
        expectedHtml.append("</li>");
        expectedHtml.append("<li>" + "I am task D" + "</li>");
        expectedHtml.append("<li>" + "I am task E" + "</li>");
        expectedHtml.append("</ul>");

        Assert.assertEquals(expectedHtml.toString(), parentProject.getHtml());

    }
}
