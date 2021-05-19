package behavioral.command;

public class Command2 implements Command{
    private Receiver receiver = null;

    public Command2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.executeCommand2();
    }

    @Override
    public void undo() {
        receiver.undoCommand2();
    }
}
