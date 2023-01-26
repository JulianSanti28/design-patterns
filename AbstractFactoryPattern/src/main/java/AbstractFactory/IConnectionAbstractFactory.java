package AbstractFactory;

import ConnectionFactory.IConnection;

public interface IConnectionAbstractFactory {

    IConnection getConnection(String arg);
}
