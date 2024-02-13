import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Algorithm s = new Algorithm();
        //LESSTHANZERO
        System.out.println(s.lessThanZero(new int[]{1,0,-1}));
        System.out.println(s.lessThanZero(new int[]{1,1,16}));
        System.out.println(s.lessThanZero(new int[]{1,0,-1,-1,-1,-188,21}));
        // ifFOUND
        System.out.println(s.ifFound(new String[]{"string","apple"}, "string"));
        System.out.println(s.ifFound(new String[]{"bat","apple"}, "string"));
        System.out.println(s.ifFound(new String[]{"string","apple","cat","messi"}, "jholmer"));
        // IN BOTH
        System.out.println(s.inBoth(new ArrayList<Integer>(Arrays.asList(2,1)), new ArrayList<Integer>(Arrays.asList(2,3))));
        System.out.println(s.inBoth(new ArrayList<Integer>(Arrays.asList(1,1)), new ArrayList<Integer>(Arrays.asList(2,15))));
        System.out.println(s.inBoth(new ArrayList<Integer>(Arrays.asList(16,1,-1)), new ArrayList<Integer>(Arrays.asList(6,-1))));
        // ARRAYLIST INDEX
        System.out.println(s.firstIndexList(new ArrayList<Integer>(Arrays.asList(1,2,3)), 2));
        System.out.println(s.firstIndexList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)), 6));
        System.out.println(s.firstIndexList(new ArrayList<Integer>(Arrays.asList(2,-2,-4)), 0));
        // LIST INDEX
        System.out.println(s.firstIndexArray(new int[]{1,2,3}, 2));
        System.out.println(s.firstIndexArray(new int[]{4,5,6}, 6));
        System.out.println(s.firstIndexArray(new int[]{0,0,0,0}, 9090909));
    }
}