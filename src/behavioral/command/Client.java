package behavioral.command;

public class Client {
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command1 = new Command1(receiver);
        Command command2 = new Command2(receiver);
        Invoker invoker = new Invoker();
        invoker.addCommand(command1);
        invoker.addCommand(command2);
        System.out.println("execute all ...");
        invoker.executeAll();
        System.out.println("undo ...");
        invoker.undo();
    }
}
