import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Algies.dupes(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3))));
        System.out.println(Algies.dupes(new ArrayList<Integer>(Arrays.asList(1,2,2,2,2,2))));
        System.out.println(Algies.dupes(new ArrayList<Integer>(Arrays.asList(3,4,6,12,2,2,4,4))));
        System.out.println(Algies.remove(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3)), 2));
        System.out.println(Algies.remove(new ArrayList<Integer>(Arrays.asList(2,2,2,22,2,2222,22,2,2)), 2));
        System.out.println(Algies.remove(new ArrayList<Integer>(Arrays.asList(2,2,3,3)), 1));
        System.out.println(Algies.addInt(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3)), 4));
        System.out.println(Algies.addInt(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3)), 4));
        System.out.println(Algies.addInt(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3)), 1));
        System.out.println(Algies.addInt(new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7,8)), 5));
        System.out.println(Algies.reverse(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3)), new ArrayList<Integer>(Arrays.asList(3,3,2,2,1))));
        System.out.println(Algies.reverse(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3)), new ArrayList<Integer>(Arrays.asList(3,3,2,2,1))));
        System.out.println(Algies.reverse(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(3,2,1))));
        System.out.println(Algies.reverse(new ArrayList<Integer>(Arrays.asList(1,2,3,4)), new ArrayList<Integer>(Arrays.asList(4,3,2,0))));
        System.out.println(Algies.max(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3))));
        System.out.println(Algies.max(new ArrayList<Integer>(Arrays.asList(3,2,1))));
        System.out.println(Algies.max(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,2,85,2,85,893,8))));
        System.out.println(Algies.min(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3))));
        System.out.println(Algies.min(new ArrayList<Integer>(Arrays.asList(3,2,1))));
        System.out.println(Algies.min(new ArrayList<Integer>(Arrays.asList(2,2,3,3,4,-2,85,2,-85,893,8))));
        System.out.println(Algies.tinyWord(new ArrayList<String>(Arrays.asList("Hello,", "world", "!"))));
        System.out.println(Algies.tinyWord(new ArrayList<String>(Arrays.asList("Hello,", "world 7", "   !   "))));
        System.out.println(Algies.tinyWord(new ArrayList<String>(Arrays.asList("Hello,", "worfld", "!", ",,,d7g,,", "347hd"))));
        System.out.println(Algies.bigWord(new ArrayList<String>(Arrays.asList("Hello,", "world", "!"))));
        System.out.println(Algies.bigWord(new ArrayList<String>(Arrays.asList("Hello,", "wrld 7", "   !   "))));
        System.out.println(Algies.bigWord(new ArrayList<String>(Arrays.asList("Messi", "is", "goated"))));
        System.out.println(Algies.bigDif(new ArrayList<Integer>(Arrays.asList(2,3,4)), new ArrayList<Integer>(Arrays.asList(-1,-2,-3))));
        System.out.println(Algies.bigDif(new ArrayList<Integer>(Arrays.asList(1,2,2,3,3)), new ArrayList<Integer>(Arrays.asList(3,3,2,2,1))));
        System.out.println(Algies.bigDif(new ArrayList<Integer>(Arrays.asList(-4,22,3,3)), new ArrayList<Integer>(Arrays.asList(3,12,8,1))));
        System.out.println(Algies.unkind(new ArrayList<Double>(Arrays.asList(1.5, 3.5, 5.5))));
        System.out.println(Algies.unkind(new ArrayList<Double>(Arrays.asList(1.5, 3.5, 5.5,5.0,6.2))));
        System.out.println(Algies.unkind(new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0))));
        System.out.println(Algies.spinItRound(new ArrayList<Integer>(Arrays.asList(1,2,3))));
        System.out.println(Algies.spinItRound(new ArrayList<Integer>(Arrays.asList(3,2,1))));
        System.out.println(Algies.spinItRound(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))));
        System.out.println(Algies.consec(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))));
        System.out.println(Algies.consec(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4))));
        System.out.println(Algies.consec(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,8,9,10))));
        System.out.println(Algies.equal(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,4,10))));
        System.out.println(Algies.equal(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))));
        System.out.println(Algies.equal(new ArrayList<Integer>(Arrays.asList(1,2,3,2))));
        System.out.println(Algies.negNelly(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,-7,8,9,10))));
        System.out.println(Algies.negNelly(new ArrayList<Integer>(Arrays.asList(1,0,-1))));
        System.out.println(Algies.negNelly(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,8,9,10))));

    }}
