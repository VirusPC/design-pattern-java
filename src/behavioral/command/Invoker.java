package behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Invoker {
    List<Command> commands = new ArrayList<Command>();
    Stack<Command> history = new Stack<Command>();

    public void addCommand(Command command) {
        this.commands.add(command);
    }
    public void executeAll() {
        for(Command command: this.commands) {
            command.execute();
            history.push((command));
        }
    }
    public void undo() {
        Command command = history.pop();
        command.undo();
    }
}
