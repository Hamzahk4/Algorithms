import java.util.ArrayList;
import java.util.Arrays;

// 7.4
public class Algies {
public String[] insertionSort(String[] strArray){
    for (int i = 1; i< strArray.length;i++){
        String currentElement =strArray[i];
        int leftOfCurrElem = i - 1;
        while (leftOfCurrElem >= 0 && strArray[leftOfCurrElem].compareToIgnoreCase(currentElement) > 0) { // while the one ahead of it is greater{
            strArray[leftOfCurrElem + 1] = strArray[leftOfCurrElem];// MOVE TO THE RIGHT
            leftOfCurrElem--; // keep going left until its in proper place
        }

    strArray[leftOfCurrElem+1]= currentElement;
    }
    return strArray;

}
// -----------------------------------------------------

    public ArrayList<String> insertionSortButForAL(ArrayList<String> strList) {
        for (int i = 1; i < strList.size(); i++) {
            String currentElement = strList.get(i);
            int leftOfCurrElem = i - 1;
            while (leftOfCurrElem >= 0 && strList.get(leftOfCurrElem).compareToIgnoreCase(currentElement) > 0) {
                strList.set(leftOfCurrElem + 1, strList.get(leftOfCurrElem));
                leftOfCurrElem--;
            }
            strList.set(leftOfCurrElem + 1, currentElement);
        }
        return strList;
    }
//  ------------------------------------------------------
public static ArrayList<Integer> insertionSortButForInts(ArrayList<Integer> intList) {
    for (int i = 1; i < intList.size(); i++) {
        int currentElement = intList.get(i);
        int leftOfCurrElem = i - 1;
        while (leftOfCurrElem >= 0 && intList.get(leftOfCurrElem) > currentElement) {
            intList.set(leftOfCurrElem + 1, intList.get(leftOfCurrElem));
            leftOfCurrElem--;
        }
        intList.set(leftOfCurrElem + 1, currentElement);
    }
    return intList;
}




}

