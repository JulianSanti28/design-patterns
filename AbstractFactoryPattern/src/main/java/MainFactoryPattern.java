import AbstractFactory.AbstractFactory;
import CommandFactory.CommandFactory;
import CommandFactory.ICommand;
import ConnectionFactory.ConnectionFactory;
import ConnectionFactory.IConnection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFactoryPattern {

    public static void main(String ... args){

//        AbstractFactory abstractFactory = AbstractFactory.getInstance();
//        CommandFactory commandFactory = (CommandFactory) abstractFactory.getFactory("command");
//        ConnectionFactory connectionFactory = (ConnectionFactory) abstractFactory.getFactory("connection");
//        IConnection connectionOne = connectionFactory.getConnection("mysql");
//        IConnection connectionTwo = connectionFactory.getConnection("postgresql");
//        ICommand commandOne =  commandFactory.getCommand("copy");
//        ICommand commandTwo = commandFactory.getCommand("cut");
//        connectionOne.connect();
//        connectionTwo.connect();
//        connectionOne.disconnect();
//        connectionTwo.disconnect();
//        commandOne.description();
//        commandTwo.description();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        ArrayList<Integer> auxNumbers = (ArrayList<Integer>) numbers;
        auxNumbers.remove(0);
        System.out.println(numbers.size());

    }


}
