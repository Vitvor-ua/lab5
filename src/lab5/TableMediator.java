package lab5;

/**
 * Interface for a mediator to handle interactions between tables.
 */
public interface TableMediator {
    /**
     * Registers a table with the mediator.
     *
     * @param table the table to register
     */
    void registerTable(Table table);

    /**
     * Adds a record to a table, checking foreign key constraints if applicable.
     *
     * @param tableName    the name of the table to add the record to
     * @param id           the unique identifier for the record
     * @param data         the data for the record
     * @param foreignKeyId the foreign key ID to validate (can be null if not applicable)
     */
    void addRecord(String tableName, int id, String data, Integer foreignKeyId);
}