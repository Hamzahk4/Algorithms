public class Algorithm {
    
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
