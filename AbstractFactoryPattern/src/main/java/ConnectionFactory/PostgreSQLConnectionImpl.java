package ConnectionFactory;

public class PostgreSQLConnectionImpl implements IConnection {

    private static PostgreSQLConnectionImpl instance;

    private PostgreSQLConnectionImpl(){
        System.out.println("Building PostgreSQL Object...");
    }

    public static PostgreSQLConnectionImpl getInstance(){
        return instance == null ? instance = new PostgreSQLConnectionImpl() : instance;
    }

    @Override
    public boolean connect() {
        System.out.println("Connect to: " + this.getClass().getName());
        return false;
    }
    @Override
    public boolean disconnect() {
        System.out.println("Disconnect of; " + this.getClass().getName());
        return false;
    }
}
