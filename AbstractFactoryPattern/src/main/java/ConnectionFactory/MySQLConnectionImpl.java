package ConnectionFactory;

public class MySQLConnectionImpl implements IConnection {

    /*Singleton*/
    private MySQLConnectionImpl(){
        System.out.println("Building MySQL Object...");
    }

    /*Attributes*/
    private static MySQLConnectionImpl instance;

    /*Methods*/
    public static MySQLConnectionImpl getInstance(){
        return instance == null ? instance = new MySQLConnectionImpl() : instance;
    }
    @Override
    public boolean connect() {
        System.out.println("Connect to: " + this.getClass().getName());
        return false;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Disconnect of: " + this.getClass().getName());
        return false;
    }
}
