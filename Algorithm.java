public class Algorithm {
    public int digits(int i){ //HOW MANY DIGITS
        String temp = " "+i;
        int numDigits = temp.length() - 1;
        return numDigits;
    }
    public boolean divisible(int a, int b){ //ARE THEY DIVISIBLE?
        return ((a%b) == 0);
    }
    public int sumOfAllDigits(int a) { // 2902
        String number = a + "";
        int numLength = number.length();
        int sum = 0;
        int i = 0;
//        System.out.println(number);
        while (i < numLength) {
            String stringatpoint = number.substring(i,i+1);
            int numatpoint = Integer.parseInt(stringatpoint);
            sum+= numatpoint;
            i++;
        }
        return sum;
    }
    public int sumOfAllInBetween(int num1, int num2){
        int i  = 0;//3
        int sum = 0;
        while (i + num1 <= num2){
            if ((num1+i) % 2 != 0){
                sum += (num1+i);
            }
            i++;
        }
        return sum;
    }
    public int multiplesOfTen(int num1, int num2){
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
    public int powerOfTwo(int num){ // had to figure out what the question was even asking to be done***
        int i = 1;
        while (i * 2 <= num) {
            i *= 2;
        }

        return i;
    }
////// STRINGS
    public boolean sameString(String a, String b){
        return (a.contains(b));
    }
    public String reverse(String str){
        String newString = "";
        int i =  str.length();;
        while (i > 0){
        newString += str.substring(i-1,i);
        i--;
    }
        return newString;
}
    public boolean palindrome(String str){
        String newString = "";
        int i =  str.length();;
        while (i > 0){
            newString += str.substring(i-1,i);
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
}
