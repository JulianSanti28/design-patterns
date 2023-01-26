package CommandFactory;
import AbstractFactory.ICommandAbstractFactory;
public class CommandFactory implements ICommandAbstractFactory {

    private static CommandFactory instance;
    private CommandFactory(){}

    public static CommandFactory getInstance(){
        return instance == null ? instance = new CommandFactory() : instance;
    }

    @Override
    public ICommand getCommand(final String args) {
        switch (args.toLowerCase()) {
            case "copy":
                return new CopyCommand();
            case "cut":
                return new CutCommand();
        }
        return null;
    }
}
