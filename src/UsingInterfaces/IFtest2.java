package UsingInterfaces;

public class IFtest2 {
    public static void main(String[] args){
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        // in this cycles  size of Stacks increased
        for(int i = 0; i < 12; i++){
            myStack1.push(i);
        }

        for(int i = 0; i < 22; i++){
            myStack2.push(i);
        }

        // get elements from Stack
        System.out.print("Elements from myStack1: ");
        for(int i = 0; i < 12; i++){
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();

        System.out.print("Elements from myStack2: ");
        for(int i = 0; i < 22; i++){
            System.out.print(myStack2.pop() + " ");
        }
    }
}
