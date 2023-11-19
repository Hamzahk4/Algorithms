import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Algorithm Alg = new Algorithm();
        System.out.println(Alg.sameString("Hello World", "World"));
        System.out.println(Alg.sameString("Hello World", "cat"));
        System.out.println(Alg.sameString("Hello World", "orl"));
        System.out.println();
        System.out.println(Alg.reverse("gohangasalami"));
        System.out.println(Alg.reverse("moo"));
        System.out.println(Alg.reverse("Messisthegoat"));
        System.out.println();
        System.out.println(Alg.palindrome("amanaplanacanalpanama"));
        System.out.println(Alg.palindrome("Messibetter"));
        System.out.println(Alg.palindrome("racecar"));
        System.out.println();
        System.out.println(Alg.numOccurances("Ratatatatatat", "at"));
        System.out.println(Alg.numOccurances("Mississippi", "si"));
        System.out.println(Alg.numOccurances("Messisimplybetter", "wheel"));
        System.out.println();
    }
    }

