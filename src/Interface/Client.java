package Interface;

public class Client implements CallBack {
    // realization iterface CallBack
    public void callback(int p){

        System.out.println("Method callback(), call with value " + p);
    }

    void nonIncaceMeth(){
        System.out.println("Diferent method in class!");
    }
}
