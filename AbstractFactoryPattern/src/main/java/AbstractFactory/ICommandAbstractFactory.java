package AbstractFactory;

import CommandFactory.ICommand;

public interface ICommandAbstractFactory {
    ICommand getCommand(String arg);
}
