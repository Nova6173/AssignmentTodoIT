package se.JavaLexicon.assignmentsTodoApplication;
//Fields
public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

//Constructors
public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee){
    this.id = id;
    this.todoItem = todoItem;
    this.assignee = assignee;

}
// Getters & setter for each field

public int getId() {
    return id;

}

public void setId(int id) {
    this.id = id;

}

public boolean isAssigned() {
    return assigned;

}

public void setAssigned(boolean assigned) {
    this.assigned = assigned;

}

public TodoItem getTodoItem() {
    return todoItem;

}

public void setTodoItem(TodoItem todoItem) {
    this.todoItem = todoItem;

}

public Person getAssigned() {
    return assignee;

}

public void setAssignee(Person assignee) {
    this.assignee = assignee;

}

// summary method

public String getSummary() {
    return "{id: " + id + ", assigned: " + assigned + ", todoItem: " + todoItem.getSummary() + ", assignee: " + (assignee != null ? assignee.getFirstName() + " " + assignee.getLastName() : "Unassigned") + "}";
}

}