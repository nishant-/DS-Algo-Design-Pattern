package patterns.behavioral.command;

//the receiver class has the command methods
public class Television {

    public void on(){
        System.out.println("switched on");
    }

    public void off(){
        System.out.println("switched off");
    }
}
