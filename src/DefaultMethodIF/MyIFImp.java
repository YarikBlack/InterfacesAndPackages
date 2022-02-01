package DefaultMethodIF;

public class MyIFImp implements MyIF{
    // in this class we must realize only one method getNumber(),
    // from interface MyIF
    // Method getString() we can use by default

    public int getNumber(){
        return 100;
    }
    
}
