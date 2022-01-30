package pl;

public class Derived extends Protection {
    Derived(){
        System.out.println("Constructor of sub class.");
        System.out.println("n: " + n);

        // available only for Class
        // System.out.println("n_pri: " + n_pri);
        System.out.println("n_pro: " + n_pro);
        System.out.println("n_pub: " + n_pub);
    }
}
