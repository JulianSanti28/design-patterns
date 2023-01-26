package CommandFactory;

public class CutCommand implements ICommand{
    @Override
    public void description() {
        System.out.println("I'm Cut Command");
    }
}
