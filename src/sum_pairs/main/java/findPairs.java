package src.sum_pairs.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class findPairs {

    public static List<Pair> findAllPairsEqualToSumBigO_N2(final int sum, final int[] array) {
        Arrays.sort(array); // n log n
        final int len = array.length;
        if (array[len -1] < sum) {
            return new ArrayList<Pair>(0); // empty list
        }
        int index = len / 2 ;
        int to = -1;
        while(index > 0) {  // log (n)
            if (array[index] >= sum) {
                to = index;
                break;
            }
            index = index / 2;
        }
        to = to < 0 ? len : to;

        List<Pair> pairs = new ArrayList<Pair>();
        for(int i = 0 ; i < to ; i++) { // O (n * n ); n = to where to <= len
            for(int k = i; k < to ; k++) {
                if (array[i] + array[k] == sum) {
                    pairs.add(new Pair(array[i], array[k]));
                }
            }
        }
        return pairs;
    }
    
    public static List<Pair> findAllPairsEqualToSumBigO_N(final int sum, final int[] array) {
        final Set<Integer> set = new HashSet<Integer>();
        for (final int a : array) { // O(n)
            set.add(a);
        }
        final Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(final int a : array) {  // O(n)
            if(map.containsKey(a)) {
                int count = map.get(a);
                count = count + 1;
                map.put(a, count);
            } else {
                map.put(a, 1);
            }
        }
        final List<Pair> pairs = new ArrayList<Pair>();

        for(final int a : array) {  // O(n)
            final int diff = sum - a;
            if (map.containsKey(diff) && map.get(diff) > 0) {   // O(1)
                pairs.add(new Pair(diff, a));
                int count = map.get(diff);
                count = count - 1;
                map.put(diff, count);
            }
        }
        
        
        return pairs;
    }

    public static void printPairs(final List<Pair> pairs) {
        System.out.println("The length of pairs :" + pairs.size());
        int count = 1;
        for(final Pair pair : pairs) {
            System.out.println(count + ". (" + pair.getA() + "," + pair.getB() + ")");
            count ++;
        }
    }
}
