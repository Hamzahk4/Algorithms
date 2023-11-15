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
    public int sumOfAllInBetween(int num1, int num2){// 1,2
        int i  = 0;//3
        int sum = 0;
        while (i <= num2){
            if ((num1+i) % 2 != 0){
                sum += (num1+i);
            }
            i++;
        }
        return sum;//5+7
    }

}
