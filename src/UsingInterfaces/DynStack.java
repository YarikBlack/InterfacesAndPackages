package UsingInterfaces;

public class DynStack implements IntStack{
    private int stck[];
    private int tos;

    // alocate memory and install Stack
    DynStack(int size){
        stck = new int [size];
        tos = -1;
    }

    // set element in Stack
    public void push(int item){
        // if stack if full alocate memory for more sizefull stack
        if(tos == stck.length - 1){
            int temp[] = new int [stck.length * 2]; // increase size of Stack by 2
            for(int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else{
            stck[++tos] = item;
        }
    }

    // get element from Stack
    public int pop(){
        if(tos < 0){
            System.out.println("Stack isn't load!");
            return 0;
        } else{
            return stck[tos--];
        }
    }
}
