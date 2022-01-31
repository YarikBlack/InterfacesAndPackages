package UsingInterfaces;

public class IFtest3 {
    public static void main(String[] args){
        IntStack mystack; // create a link on interface
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;  // load dynamic Stack
        // set elements in Stack
        for(int i = 0; i < 12; i++){
            mystack.push(i);
        }

        mystack = fs; // load fixed Stack
        // set elements in Stack
        for(int i = 0; i < 8; i++){
            mystack.push(i);
        }

        mystack = ds;
        // get elements from Stack
        System.out.println("Elements in Dynamic Stack: ");
        for(int i = 0; i < 12; i++){
            System.out.println(mystack.pop());
        }

        mystack = fs;
        System.out.println("Elements in Fixed Stack: ");
        for(int i = 0; i < 8; i++){
            System.out.println(mystack.pop());
        }
    }
}
