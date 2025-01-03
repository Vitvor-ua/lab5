package lab5;

/**
 * Interface for a relational table.
 */
public interface RelationalTable {
    /**
     * Adds a new record to the table.
     *
     * @param id   the unique identifier for the record
     * @param data the data associated with the record
     */
    void addRecord(int id, String data);

    /**
     * Deletes a record from the table by its ID.
     *
     * @param id the unique identifier of the record to delete
     */
    void deleteRecord(int id);

    /**
     * Checks if a record exists in the table.
     *
     * @param id the unique identifier of the record to check
     * @return true if the record exists, false otherwise
     */
    boolean recordExists(int id);
}