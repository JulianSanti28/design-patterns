import AbstractFactory.AbstractFactory;
import CommandFactory.CommandFactory;
import CommandFactory.ICommand;
import ConnectionFactory.ConnectionFactory;
import ConnectionFactory.IConnection;
public class MainFactoryPattern {

    public static void main(String ... args){
        AbstractFactory abstractFactory = AbstractFactory.getInstance();
        CommandFactory commandFactory = (CommandFactory) abstractFactory.getFactory("command");
        ConnectionFactory connectionFactory = (ConnectionFactory) abstractFactory.getFactory("connection");
        IConnection connectionOne = connectionFactory.getConnection("mysql");
        IConnection connectionTwo = connectionFactory.getConnection("postgresql");
        ICommand commandOne =  commandFactory.getCommand("copy");
        ICommand commandTwo = commandFactory.getCommand("cut");
        connectionOne.connect();
        connectionTwo.connect();
        connectionOne.disconnect();
        connectionTwo.disconnect();
        commandOne.description();
        commandTwo.description();
    }
}
