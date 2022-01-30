package pl1;

public class Demo {
    public static void main(String[] args){
        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();

        ob1.n_pub = 20;
        ob2.i = 10;
    }
}
