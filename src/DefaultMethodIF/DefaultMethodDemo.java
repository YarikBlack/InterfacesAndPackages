package DefaultMethodIF;

public class DefaultMethodDemo {
    public static void main(String[] args){

        MyIFImp obj = new MyIFImp();

        // method getNumber() we can use because he realize
        // in class MyIFImp
        System.out.println(obj.getNumber());

        // method getString() we also can use because
        // interface had default realization of this method
        System.out.println(obj.getString());
    }
}
