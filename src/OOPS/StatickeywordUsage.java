package OOPS;

public class StatickeywordUsage {
    public static void main(String[] args) {
        StaticKeyword obj = new StaticKeyword("Raju",420);
        StaticKeyword obj1 = new StaticKeyword("Pappu",420);
        StaticKeyword obj2= new StaticKeyword("Kalia",420);
        StaticKeyword obj3 = new StaticKeyword("Bokando",420);
        StaticKeyword obj4 = new StaticKeyword("Anda",420);
        System.out.println(StaticKeyword.count);
    }
}
