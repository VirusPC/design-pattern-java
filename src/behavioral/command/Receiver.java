package behavioral.command;

public class Receiver {
    public void executeCommand1(){
        System.out.println("execute command1");
    }
    public void undoCommand1(){
        System.out.println("undo command1");
    }
    public void executeCommand2(){
        System.out.println("execute command2");
    }
    public void undoCommand2(){
        System.out.println("undo command2");
    }
}
