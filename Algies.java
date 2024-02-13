import java.util.ArrayList;
// 7.4
public class Algies {
    public static ArrayList<Integer> dupes(ArrayList<Integer> ints) {
        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i - 1) == ints.get(i)) {
                ints.remove(i);
                i--;
            }
        }
        return ints;
    }
    public static ArrayList<Integer> remove(ArrayList<Integer> ints, int n){
        for(int i = 0; i < ints.size();i++){
            if(ints.get(i) == n){ints.remove(i); i--;}
        }
        return ints;
    }
    public static ArrayList<Integer> addInt (ArrayList<Integer> ints, int n){
        int j = 0;
        for(int i = 0; i < ints.size() && ints.get(i) < n; i++){
            j = i;
        }
        ints.add(j+1, n);
        return ints;
    }

    public static boolean reverse(ArrayList<Integer> list, ArrayList<Integer> ints){

        for (int i = 0; i < list.size(); i++){
            if(list.get(i) != ints.get(ints.size()-1-i)) return false;
        }
        return true;
    }
    public static int max(ArrayList<Integer> ints){
        int max = ints.get(0);
        for(int i = 1; i < ints.size(); i++){
            if (ints.get(i) > max) max = ints.get(i);
        }
        return max;
    }

    public static int min(ArrayList<Integer> ints){
        int min = ints.get(0);
        for(int i = 1; i < ints.size(); i++){
            if (ints.get(i) < min) min = ints.get(i);
        }
        return min;
    }

    public static String tinyWord(ArrayList<String> strs){
        String s = strs.get(0);
        for (int i = 1; i < strs.size(); i++){
            if(strs.get(i).length() > s.length()) s = strs.get(i);
        }
        return s;
    }
    public static String bigWord(ArrayList<String> strs) {
        String s = strs.get(0);
        for (int i = 1; i < strs.size(); i++) {
            if (strs.get(i).length() < s.length()) s = strs.get(i);
        }
        return s;
    }

    public static int bigDif(ArrayList<Integer> ints, ArrayList<Integer> list){
        int d = Math.abs(ints.get(0) - list.get(0));
        for(int i = 1; i < ints.size(); i++){
            if (Math.abs(ints.get(i) - list.get(i)) > d) d = Math.abs(ints.get(i) - list.get(i));
        }
        return d;
    }

    public static double unkind(ArrayList<Double> ints){
        double sum = 0;
        for (int i = 0; i < ints.size(); i++){
            sum += ints.get(i);
        }
        return sum / ints.size();
    }

    public static ArrayList<Integer> spinItRound(ArrayList<Integer> ints){
        ArrayList<Integer> news = new ArrayList<>();
        for(int i =0; i < ints.size(); i++){
            news.add(0, ints.get(i));
        }
        return news;
    }
    public static boolean consec(ArrayList<Integer> ints){
        for(int i = 1; i < ints.size(); i++){
            if(ints.get(i-1) == ints.get(i)) return true;
        }
        return false;
    }
    public static boolean equal(ArrayList<Integer> ints ){
        for(int i = 0; i < ints.size(); i++){
            for(int j = i+1; j < ints.size(); j++){
                if (ints.get(i) == ints.get(j)) return true;
            }
        }
        return false;
    }

    public static int negNelly(ArrayList<Integer> ints){
        for(int i = 0; i < ints.size(); i++){
            if(ints.get(i) < 0) return i;
        }
        return -1;
    }

}
