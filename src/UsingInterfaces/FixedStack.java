package UsingInterfaces;

public class FixedStack implements IntStack {
    private int stck[];
    private int tos;
    
    // allocate memory and installing Stack
    FixedStack(int size){
        stck = new int [size];
        tos = -1;
    }
    
    // set element in Stack
    public void push(int item){
        if(tos == stck.length){
            System.out.println("Stack is full!");
        } else{
            stck[++tos] = item;
        }
    }

    public int pop(){
        if(tos < 0){
            System.out.println("Stack isn't full!");
            return 0;
        } else{
            return stck[tos--];
        }
    }
}
