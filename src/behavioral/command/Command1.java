package behavioral.command;

public class Command1 implements Command{

    private Receiver receiver = null;

    public Command1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.executeCommand1();
    }

    @Override
    public void undo() {
        receiver.undoCommand1();
    }
}
