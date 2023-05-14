package DataStuctures.Strings;

import java.util.Scanner;

public class StringInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String Name = sc.nextLine();
        System.out.println("Name you Entered is "+ Name);
    }
}
