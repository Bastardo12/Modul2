package Massiv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Array {
    public static void DifferentValues(int[] mass) {
        public static void DifferentValues ( int[] mass)
        {
            Set<Integer> set = new HashSet<>();
            for (int x : mass) {
                set.add(x);
            }
            System.out.println(set.size());
        }


    public static void main(String[] mass) {

        int[] ar = {1, 4, 5, 1, 1, 3};

        DifferentValues(ar);

    }
}}
