package ConnectionFactory;

import AbstractFactory.IConnectionAbstractFactory;

public class ConnectionFactory implements IConnectionAbstractFactory {
    private static ConnectionFactory instance;
    private ConnectionFactory(){}

    public static ConnectionFactory getInstance(){
        return instance == null ? instance = new ConnectionFactory() : instance;
    }
    @Override
    public IConnection getConnection(final String arg){
        switch (arg.toLowerCase()) {
            case "mysql":
                return MySQLConnectionImpl.getInstance();
            case "postgresql":
                return PostgreSQLConnectionImpl.getInstance();
        }
        throw new RuntimeException("No arg found!");
    }

}
