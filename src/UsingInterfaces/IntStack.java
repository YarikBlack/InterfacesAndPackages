package UsingInterfaces;

public interface IntStack {
    void push(int item); // set element in Stack
    int pop(); // get element from Stack
    
    default void clear(){
        throw new UnsupportedOperationException();
    }
}
