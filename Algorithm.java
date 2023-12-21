import java.sql.SQLOutput;

public class Algorithm {
    public int digits(int i) { //HOW MANY DIGITS
        String temp = " " + i;
        int numDigits = temp.length() - 1;
        return numDigits;
    }

    public boolean divisible(int a, int b) { //ARE THEY DIVISIBLE?
        return ((a % b) == 0);
    }

    public int sumOfAllDigits(int a) { // 2902
        String number = a + "";
        int numLength = number.length();
        int sum = 0;
        int i = 0;
//        System.out.println(number);
        while (i < numLength) {
            String stringatpoint = number.substring(i, i + 1);
            int numatpoint = Integer.parseInt(stringatpoint);
            sum += numatpoint;
            i++;
        }
        return sum;
    }

    public int sumOfAllInBetween(int num1, int num2) {
        int i = 0;//3
        int sum = 0;
        while (i + num1 <= num2) {
            if ((num1 + i) % 2 != 0) {
                sum += (num1 + i);
            }
            i++;
        }
        return sum;
    }

    public int multiplesOfTen(int num1, int num2) {
        int start;
        int sum = 0;
        if (num1 % 10 == 0) { //is num1 a multiple?
            start = num1;
        } else {
            start = num1 + (10 - num1 % 10); // if not, it will be the closest multiple
        }
        while (start <= num2) {
            sum += start;
            start += 10;
        }
        return sum;
    }

    public int powerOfTwo(int num) { // had to figure out what the question was even asking to be done***
        int i = 1;
        while (i * 2 <= num) {
            i *= 2;
        }

        return i;
    }

    ////// STRINGS
    public boolean sameString(String a, String b) {
        return (a.contains(b));
    }

    public String reverse(String str) {
        String newString = "";
        int i = str.length();
        ;
        while (i > 0) {
            newString += str.substring(i - 1, i);
            i--;
        }
        return newString;
    }

    public boolean palindrome(String str) {
        String newString = "";
        int i = str.length();
        ;
        while (i > 0) {
            newString += str.substring(i - 1, i);
            i--;
        }
        return (str.equals(newString));
    }

    public int numOccurances(String a, String b) {
        int strcount = 0;
        int index = a.indexOf(b);
        while (index != -1) {
            strcount++;
            index = a.indexOf(b, index + 1);
        }
        return strcount;
    }


    //ARRAYYYSSSSSS
    public void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int maxOfArray(int[] array) {
        int greatest = array[0];
        for (int i : array) {
            if (i > greatest) {
                greatest = i;
            }
        }
        return greatest;
    }

    public int minOfArray(int[] array) {
        int least = array[0];
        for (int i : array) {
            if (i < least) {
                least = i;
            }
        }
        return least;
    }

    public void swapArray(int[] array, int a, int b) {/// 1,2,3,4   1   2
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println();
    }

    public String minOfStringArray(String[] array) {
        String least = array[0];
        for (String i : array) {
            if (i.length() < least.length()) {
                least = i;
            }
        }
        return least;
    }

    public String maxOfStringArray(String[] array) {
        String greatest = array[0];
        for (String i : array) {
            if (i.length() > greatest.length()) {
                greatest = i;
            }
        }
        return greatest;
    }

    public int largestDif(int[] a, int[] b) {
        int alargest = 0;
        int blargest = 0;
        for (int i : a) {
            if (Math.abs(i) > alargest) {
                alargest = Math.abs(i);
            }
        }
        for (int i : b) {
            if (Math.abs(i) > blargest) {
                blargest = Math.abs(i);
            }
        }
        return blargest + alargest;
    }


    public double meanAvg(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum = sum + i;
        }
        return sum / array.length;
    }

    public void reverseArray(int[] array) {
        int firstVal = 0;
        int lastVal = array.length - 1;

        while (firstVal < lastVal) {
            int temp = array[firstVal];
            array[firstVal] = array[lastVal];
            array[lastVal] = temp;
            firstVal = firstVal + 1;
            lastVal = lastVal - 1;
        }
        for (int i : array) {
            System.out.println(i);
        }
        ;
        System.out.println();
    }


    public int firstNeg(int[] array) {
        for (int i : array) {
            if (i < 0) return i;
        }
        return -1;
    }

    public boolean twoConsecutiveVals(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] == array[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean equivalantVals(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            int j = i + 1;
            while (j < array.length) {
                if (array[i] == array[j]) {
                    return true;
                    // if one value is = to other values of the index
                }
                j++;
            }
            // if not, move on to the next value and check
            i++;
        }
        return false;
    }

    public int longestStreak(int[] array, int targetVal){
        int streak = 0;
        int maxStreak = 0;
        for (int i : array){
            if (i == targetVal){
                streak++;
                if (streak > maxStreak){maxStreak = streak;}
            }
            else streak = 0; //reset
        }
        return maxStreak;
    }

    public String alphabeticallyLast(String[] array) {
        String lastWordAlphabetically = array[0]; // assume the first one is the last one
        int i = 1;
        while (i < array.length) {
            if (array[i].compareTo(lastWordAlphabetically) > 0) {
                lastWordAlphabetically = array[i];}
            i++;}
        return lastWordAlphabetically;
    }

}
