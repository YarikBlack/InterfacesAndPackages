package pl1;

import pl.Protection;

public class OtherPackage {
    
    int i;
    
    OtherPackage(){

        Protection p = new Protection();

        System.out.println("Constructor from other Package!");

        // Accsess only for current class or package
        // System.out.println("n: " + p.n);

        // Accsess only for current class
        // System.out.println("n_pri: " + p.n_pri);

        // Accsess only for current class, sub class and package
        // System.out.println("n_pro: " + p.n_pro);

        System.out.println("n_pub: " + p.n_pub);
    }
}
