package se.JavaLexicon.assignmentsTodoApplication;

import java.time.LocalDate;

public class App {
    // Declaring a variable todoItem
    private static Object todoItem;

    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person(1, "John", "Doe", "johndoe@hotmail.com");
        Person person2 = new Person(2, "Jane", "Doe", "janedoe@hotmail.com");

        // Creating TodoItem objects
        TodoItem todoItem1 = new TodoItem(1, "Change Tires", "Changes the tires on the car", LocalDate.now().plusDays(7), false, person1);
        TodoItem todoItem2 = new TodoItem(2, "Do Laundry", "Do the kids laundry",  LocalDate.now().plusDays(3), false, person2);

        // Creating TodoItemTask objects and assigning them to persons
        TodoItemTask task1 = new TodoItemTask(1, todoItem1);
        task1.setAssigned(true);
        task1.setAssignee(person1);

        TodoItemTask task2 = new TodoItemTask(2, todoItem2);

        // Printing summaries
        System.out.println(person1.getSummary());
        System.out.println(person2.getSummary());
        System.out.println(todoItem1.getSummary());
        System.out.println(todoItem2.getSummary());
        System.out.println(task1.getSummary());
        System.out.println(task2.getSummary());
    }
}
