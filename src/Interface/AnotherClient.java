package Interface;

public class AnotherClient implements CallBack {
    // realization interface CallBack
    public void callback(int p) {
        System.out.println("Another variant of method callback()");
        System.out.println("p * p: " + (p * p));
    }
}
