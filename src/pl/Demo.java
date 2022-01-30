package pl;

public class Demo {
    public static void main(String[] args){
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();

        ob1.n = 10;
        ob2.n = 10;
        ob3.i = 10;
    }
}
