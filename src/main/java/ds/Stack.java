package ds;

public class Stack<T> {

    private T data;
    private int size;
    private int top;
    private T arr[];

    /**
     * Creates a stack of size 10;
     * */
    public Stack(){
        this.size=10;
        this.top=-1;
        this.arr = (T[])new Object[size];
    }

    public Stack(int size){
        this.size=size;
        this.top=-1;
        this.arr = (T[])new Object[size];
    }

    public boolean isEmpty () {

        return top==-1?true:false;
    }

    public void push(T data) {
        if(top==size-1){
            throw new RuntimeException("Stack is full...");
        }
        arr[++top] = data;
    }

    public T pop (){
        if(top==-1)
            throw new RuntimeException("Stack is empty...");
        return arr[top--];
    }

    public void display(){
        System.out.println("Starting from top");
        for(int i=top;i>=0;i--) {
            System.out.println(arr[i]);
        }
        System.out.println("End printing stack");
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>(4);
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
       // s.push("e");
       // s.push("f");
        s.pop();
        s.display();
        s.pop();
        s.display();
    }
}
