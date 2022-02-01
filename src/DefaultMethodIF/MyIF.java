package DefaultMethodIF;

public interface MyIF {
    // it's standart method in iterface
    // without realization
    int getNumber();

    // this is default method, you not must realize him
    // but can use if you want
    default String getString(){
        return "Object type String in default method";
    }
}
