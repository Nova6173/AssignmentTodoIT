package se.JavaLexicon.assignmentsTodoApplication;


import java.time.LocalDate;

// Fields

class TodoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private boolean done;
    private Person creator;

    // Constructors
    public TodoItem(int id, String title, String taskDescription, LocalDate deadline, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.done = done;
        this.creator = creator;
    }

    public TodoItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getters & setters for each field
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    // Summary method
    public String getSummary() {
        return "{id: " + id + ", title: " + title + ", description: " + taskDescription + ", deadline: " + deadline + ", done: " + done + ", creator: " + creator.getFirstName() + " " + creator.getLastName() + "}";
    }

    // Overridden method to check if a task is overdue
    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadline);
    }
}
