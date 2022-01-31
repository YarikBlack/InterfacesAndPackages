package Interface;

abstract class InComplete  implements CallBack{
    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }

    // this class isn't realize a method from interface CallBack
    // so this is shoud be abstract class
    
}
