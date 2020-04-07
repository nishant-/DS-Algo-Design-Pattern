package patterns.behavioral.command;

public class App {

    public static void main(String[] args) {


        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();

        OnCommand onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

    }
}
