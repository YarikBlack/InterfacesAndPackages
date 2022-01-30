package pl1;

import pl.Protection;

public class Protection2 extends Protection{
    
    Protection2(){
        System.out.println("Constructor from other package!");
        
        // Accsess only for current class or package
        // System.out.println("n: " + n);

        // Accsess only for current class
        // System.out.println("n_pri: " + n_pri);

        System.out.println("n_pro: " + n_pro);
        System.out.println("n_pub: " + n_pub);
    }
}
