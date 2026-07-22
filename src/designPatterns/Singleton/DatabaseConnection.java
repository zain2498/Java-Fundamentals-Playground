package designPatterns.Singleton;

public enum DatabaseConnection {
    INSTANCE;

    private String connectionString = "jdbc:mysql://localhost:3306/mydb";

    public void connect() {
        System.out.println("Connecting to database..."+connectionString);
    }

    public void disconnect() {
        System.out.println("Disconnecting from database..."+connectionString);
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public static void  main(String[] args){
        DatabaseConnection connection = DatabaseConnection.INSTANCE;
        connection.connect();
        connection.disconnect();
    }
}
