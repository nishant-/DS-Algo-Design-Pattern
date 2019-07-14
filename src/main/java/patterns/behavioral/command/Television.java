package patterns.behavioral.command;

//the receiver class
public class Television {

    public void on(){
        System.out.println("switched on");
    }

    public void off(){
        System.out.println("switched off");
    }
}
