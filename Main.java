import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Algorithm Alg = new Algorithm();
        System.out.println(Alg.digits(23469236));
        System.out.println(Alg.digits(1111));
        System.out.println(Alg.digits(98));
        System.out.println();
        System.out.println(Alg.divisible(9, 4));
        System.out.println(Alg.divisible(9, 3));
        System.out.println(Alg.divisible(100, 10));
        System.out.println();
        System.out.println(Alg.sumOfAllDigits(999));
        System.out.println(Alg.sumOfAllDigits(102837));
        System.out.println(Alg.sumOfAllDigits(1245));
        System.out.println();
        System.out.println(Alg.sumOfAllInBetween(1,3));
        System.out.println(Alg.sumOfAllInBetween(3,7));
        System.out.println(Alg.sumOfAllInBetween(4,974));
        System.out.println();
        System.out.println(Alg.multiplesOfTen(10,99));
        System.out.println(Alg.multiplesOfTen(5,27));
        System.out.println(Alg.multiplesOfTen(101,990));
        System.out.println();
        System.out.println(Alg.powerOfTwo(800));
        System.out.println(Alg.powerOfTwo(2));
        System.out.println(Alg.powerOfTwo(15));


    }
}
