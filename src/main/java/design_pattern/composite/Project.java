package design_pattern.composite;

import java.util.List;

public class Project implements TodoList {
    private String text;
    private List<TodoList> todos;

    public Project(String text, List<TodoList> todos) {
        this.text = text;
        this.todos = todos;
    }

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder(this.text);
        html.append("<ul>");
        for (TodoList t : this.todos) {
            html.append("<li>");
            html.append(t.getHtml());
            html.append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }
}
