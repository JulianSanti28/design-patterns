package AbstractFactory;

import CommandFactory.CommandFactory;
import ConnectionFactory.ConnectionFactory;

public class AbstractFactory {

    private static AbstractFactory instance;

    private AbstractFactory(){}

    public static AbstractFactory getInstance(){
        return instance == null ? instance = new AbstractFactory() : instance;
    }

    public Object getFactory(String arg){
        switch (arg.toLowerCase()){
            case "connection":
                return ConnectionFactory.getInstance();
            case "command":
                return CommandFactory.getInstance();
        }
        throw new RuntimeException("No found factory with arg: " + arg);
    }
}
