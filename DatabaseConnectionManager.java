public class DatabaseConnectionManager {
    private static volatile DatabaseConnectionManager connection;

    private DatabaseConnectionManager() {
        System.out.println("Conexão com o banco de dados criada");
    }

    public static DatabaseConnectionManager getInstance() {
        if(connection == null) {
            synchronized(DatabaseConnectionManager.class) {
                if(connection == null) {
                    connection = new DatabaseConnectionManager();
                }
            }
        }

        return connection;
    }
}