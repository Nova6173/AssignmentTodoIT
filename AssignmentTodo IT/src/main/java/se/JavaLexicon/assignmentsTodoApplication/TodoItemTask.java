package se.JavaLexicon.assignmentsTodoApplication;


class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // Constructors
    public TodoItemTask(int id, TodoItem todoItem) {
        this.id = id;
        this.todoItem = todoItem;
    }

    public TodoItemTask() {
    }

    // Getters & setters for each field
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

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    // Summary method
    public String getSummary() {
        return "{id: " + id + ", assigned: " + assigned + ", todoItem: " + todoItem.getSummary() + ", assignee: " + (assignee != null ? assignee.getFirstName() + " " + assignee.getLastName() : "Unassigned") + "}";
    }
}