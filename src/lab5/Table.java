package lab5;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of a relational table.
 */
public class Table implements RelationalTable {
    private final String name;
    private final Map<Integer, String> records;

    /**
     * Constructor for the table.
     *
     * @param name the name of the table
     */
    public Table(String name) {
        this.name = name;
        this.records = new HashMap<>();
    }

    @Override
    public void addRecord(int id, String data) {
        records.put(id, data);
        System.out.println("Added record to " + name + ": ID = " + id + ", Data = " + data);
    }

    @Override
    public void deleteRecord(int id) {
        if (records.containsKey(id)) {
            records.remove(id);
            System.out.println("Deleted record from " + name + ": ID = " + id);
        } else {
            System.out.println("Record with ID " + id + " does not exist in " + name);
        }
    }

    @Override
    public boolean recordExists(int id) {
        return records.containsKey(id);
    }

    public String getName() {
        return name;
    }
}