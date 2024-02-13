import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Algorithm Alg = new Algorithm();
//        System.out.println(Alg.digits(23469236));
//        System.out.println(Alg.digits(1111));
//        System.out.println(Alg.digits(98));
//        System.out.println();
//        System.out.println(Alg.divisible(9, 4));
//        System.out.println(Alg.divisible(9, 3));
//        System.out.println(Alg.divisible(100, 10));
//        System.out.println();
//        System.out.println(Alg.sumOfAllDigits(999));
//        System.out.println(Alg.sumOfAllDigits(102837));
//        System.out.println(Alg.sumOfAllDigits(12995));
//        System.out.println();
//        System.out.println(Alg.sumOfAllInBetween(1,3));
//        System.out.println(Alg.sumOfAllInBetween(3,7));
//        System.out.println(Alg.sumOfAllInBetween(4,974));
//        System.out.println();
//        System.out.println(Alg.multiplesOfTen(10,99));
//        System.out.println(Alg.multiplesOfTen(5,27));
//        System.out.println(Alg.multiplesOfTen(101,990));
//        System.out.println();
//        System.out.println(Alg.powerOfTwo(800));
//        System.out.println(Alg.powerOfTwo(2));
//        System.out.println(Alg.powerOfTwo(15));
//          System.out.println();

        /// STRINGS ///

//        System.out.println(Alg.sameString("Hello World", "World"));
//        System.out.println(Alg.sameString("Hello World", "cat"));
//        System.out.println(Alg.sameString("Hello World", "orl"));
//        System.out.println();
//        System.out.println(Alg.reverse("gohangasalami"));
//        System.out.println(Alg.reverse("moo"));
//        System.out.println(Alg.reverse("Messisthegoat"));
//        System.out.println();
//        System.out.println(Alg.palindrome("amanaplanacanalpanama"));
//        System.out.println(Alg.palindrome("Messibetter"));
//        System.out.println(Alg.palindrome("racecar"));
//        System.out.println();
//        System.out.println(Alg.numOccurances("Ratatatatatat", "at"));
//        System.out.println(Alg.numOccurances("Mississippi", "si"));
//        System.out.println(Alg.numOccurances("Messisimplybetter", "wheel"));
//        System.out.println()

        // ARRAYYYSSSSSSS *some of them print just to verify that it worked*
        Alg.printArray(new int[]{1,2,3});
        Alg.printArray(new int[]{1,1,1,1,1,1,1,4});
        Alg.printArray(new int[]{6, 2,5});
        System.out.println();
        Alg.swapArray(new int[]{1,2,3,4},1,2);
        Alg.swapArray(new int[]{1,2,3,4,5},2,1);
        Alg.swapArray(new int[]{99,81,33},0,2); //prints to check if it worked*
        System.out.println();
        System.out.println(Alg.maxOfArray(new int[]{3,2,1}));
        System.out.println(Alg.maxOfArray(new int[]{1000000,443,2}));
        System.out.println(Alg.maxOfArray(new int[]{2,2,2,2,2,2,1562}));
        System.out.println();
        System.out.println(Alg.minOfArray(new int[]{3,2,1}));
        System.out.println(Alg.minOfArray(new int[]{1000000,443,89}));
        System.out.println(Alg.minOfArray(new int[]{2,1,2,2,2,2,1562}));
        System.out.println();
        System.out.println(Alg.minOfStringArray(new String[]{"Hello,", "world", "!"}));
        System.out.println(Alg.minOfStringArray(new String[]{"Messi","is","betterthanronaldo"}));
        System.out.println(Alg.minOfStringArray(new String[]{"Mr.Holmer","W","teacher"}));
        System.out.println();
        System.out.println(Alg.maxOfStringArray(new String[]{"Hello,", "world", "!"}));
        System.out.println(Alg.maxOfStringArray(new String[]{"Messi","is","the","GOAT"}));
        System.out.println(Alg.maxOfStringArray(new String[]{"Let","him","cook"}));
        System.out.println();
        System.out.println(Alg.meanAvg(new double[]{2.0,3.0,4.0,5.0}));
        System.out.println(Alg.meanAvg(new double[]{22.5,15.6,17.2}));
        System.out.println(Alg.meanAvg(new double[]{1.0,1.0,1.0,50.0}));
        System.out.println();
        System.out.println(Alg.firstNeg(new int[]{1,3,-1,7,-3,2,4}));
        System.out.println(Alg.firstNeg(new int[]{1,0,-1}));
        System.out.println(Alg.firstNeg(new int[]{4,15,-122}));
        System.out.println();
        System.out.println(Alg.largestDif(new int[]{2,3,4},new int[]{-1,-2,-3}));
        System.out.println(Alg.largestDif(new int[]{1,1,1},new int[]{-2,-6,-9}));
        System.out.println(Alg.largestDif(new int[]{15,1,19919},new int[]{-2,-6,-9}));
        System.out.println();
        Alg.reverseArray(new int[]{1,2,3}); // prints to check if the change worked*
        Alg.reverseArray(new int[]{4,2,3,1});
        Alg.reverseArray(new int[]{99,88,77});
        System.out.println();
        System.out.println(Alg.twoConsecutiveVals(new int[]{1,2,3,3,4}));
        System.out.println(Alg.twoConsecutiveVals(new int[]{3,3,3,3,3}));
        System.out.println(Alg.twoConsecutiveVals(new int[]{5,4,3,2,1}));
        System.out.println();
        System.out.println(Alg.equivalantVals(new int[]{1,2,3,2}));
        System.out.println(Alg.equivalantVals(new int[]{4,5,6}));
        System.out.println(Alg.equivalantVals(new int[]{1,2,6,8,99999,4,5,99999}));
        System.out.println();
        System.out.println(Alg.longestStreak(new int[]{1,2,1,1,1},1));
        System.out.println(Alg.longestStreak(new int[]{1,1,1,1,1,1,1,1},4));
        System.out.println(Alg.longestStreak(new int[]{1,2,3,4,5},5));
        System.out.println();
        System.out.println(Alg.alphabeticallyLast(new String[]{"zebra","alpha"}));
        System.out.println(Alg.alphabeticallyLast(new String[]{"Hamzah","Messi"}));
        System.out.println(Alg.alphabeticallyLast(new String[]{"Trump","Biden"}));












    }



    }

