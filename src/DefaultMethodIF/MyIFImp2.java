package DefaultMethodIF;

public class MyIFImp2 implements MyIF{
    // in this class we realize a both methods from iterface
    // getNumber() and getString()
    public int getNumber(){
        return 120;
    }

   public String getString(){
       return "This is diferent String!";
   }
}
