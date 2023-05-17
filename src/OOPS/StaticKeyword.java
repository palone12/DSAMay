package OOPS;

public class StaticKeyword {
    String name ;
    int number ;
    static int count;

    final static float  CONVERSIOTION_FACTOR = 0.99f; // If both static and float is used together then variable name should be capital all

    public StaticKeyword(String n, int num){
        name=n;
        number =num;
        count++;
    }

}
