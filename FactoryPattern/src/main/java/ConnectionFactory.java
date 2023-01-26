public class ConnectionFactory {
    IConnection getConnection(String args){
        switch (args.toLowerCase()) {
            case "mysql":
                return MySQLConnectionImpl.getInstance();
            case "postgresql":
                return PostgreSQLConnectionImpl.getInstance();
        }
        return null;
    }
}
