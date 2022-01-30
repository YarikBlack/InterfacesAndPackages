package pl;

public class SamePackage {

    int i = 10;
    
    SamePackage(){

        Protection p = new Protection();
        System.out.println("Constructor of same Package.");
        System.out.println("n: " + p.n);
        
        // Accsess only for class
        //System.out.println("n_pri: " + p.n_pri);

        System.out.println("n_pro: " + p.n_pro);
        System.out.println("n_pub: " + p.n_pub);
    }
}
