package Interface;

public class TestIface2 {
    public static void main (String[] args){
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob; // now c link in object type of AnotherClient

        c.callback(42);
    }
}
