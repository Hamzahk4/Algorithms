import java.util.ArrayList;

public class Algorithm {

    public int lessThanZero(int[] arr){
        int count = 0;
        for (int i : arr){
            if(i<0) count++;
        }
        return count;
    }

    public boolean ifFound(String[] str, String s){
        boolean bool = false;
        for (String i : str){
            if (i.equals(s) == true) bool = true;
        }
        return bool;
    }

    public boolean inBoth (ArrayList<Integer> a,ArrayList<Integer> b){
        for (int i : a){
            for (int j : b){
                if(i == j) return true;
            }
        }
        return false;
    }

    public int firstIndexList(ArrayList<Integer> arr, int a){
        for(int i = 0;i < arr.size(); i++){
            if (arr.get(i) == a) return i;
        }
        return -1;
    }

    public int firstIndexArray(int[] arr, int a){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == a) return i;
        }
        return -1;
    }
}