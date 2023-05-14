package DataStuctures.Strings.StringFunctions;

public class StringFunctionsApplication {
    public static void main(String[] args) {
        String name = "Pranay";
        String name2 = "Alone";
        System.out.println(name.charAt(4)); // Gives char at particular index provided in argument
        System.out.println(name.equals(name2)); // Gives boolean avalue by comparing two strings.
        String Concanted = name + name2;
        // OR
        System.out.println(name.concat(name2));
        System.out.println(Concanted);

        // length of sring
        System.out.println(name.length());

        // Substring Function
        String Description = "Frontend Developer Works with HTML CSS JS REACT AND NEXT JS";
        System.out.println(Description.substring(3));// Only with Startt Indes
        System.out.println(Description.substring(5,9)); // With start and end index end index is exclusive

    }
}
