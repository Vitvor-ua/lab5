import lab5.*;

public class Main {
    public static void main(String[] args) {
        DatabaseMediator mediator = new DatabaseMediator();

        Table users = new Table("Users");
        Table orders = new Table("Orders");

        mediator.registerTable(users);
        mediator.registerTable(orders);

        // Add records to Users table
        mediator.addRecord("Users", 1, "Alice", null);
        mediator.addRecord("Users", 2, "Bob", null);

        // Add records to Orders table with valid foreign key
        mediator.addRecord("Orders", 101, "Order 1", 1);
        mediator.addRecord("Orders", 102, "Order 2", 2);

        // Attempt to add a record with an invalid foreign key
        mediator.addRecord("Orders", 103, "Order 3", 3);
    }
}