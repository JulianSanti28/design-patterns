package CommandFactory;

public class CopyCommand implements ICommand{
    @Override
    public void description() {
        System.out.println("I'm Copy Command!");
    }
}
