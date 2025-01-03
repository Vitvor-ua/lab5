package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the mediator for table interactions.
 */
public class DatabaseMediator implements TableMediator {
    private final List<Table> tables;

    /**
     * Constructor for the mediator.
     */
    public DatabaseMediator() {
        this.tables = new ArrayList<>();
    }

    @Override
    public void registerTable(Table table) {
        tables.add(table);
        System.out.println("Registered table: " + table.getName());
    }

    @Override
    public void addRecord(String tableName, int id, String data, Integer foreignKeyId) {
        Table targetTable = tables.stream()
                .filter(table -> table.getName().equals(tableName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Table " + tableName + " not found"));

        if (foreignKeyId != null) {
            boolean foreignKeyValid = tables.stream()
                    .anyMatch(table -> table.recordExists(foreignKeyId));

            if (!foreignKeyValid) {
                System.out.println("Foreign key constraint violated. Record not added to " + tableName);
                return;
            }
        }

        targetTable.addRecord(id, data);
    }
}