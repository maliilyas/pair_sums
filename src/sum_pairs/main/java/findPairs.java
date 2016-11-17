package sum_pairs.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findPairs {

    public static List<Pair> findAllPairsEqualToSum(final int sum, final int[] array) {
        Arrays.sort(array); // n log n
        final int len = array.length;
        if (array[len -1] < sum) {
            return new ArrayList<Pair>(0); // empty list
        }
        int index = len / 2 ;
        int to = -1;
        while(index > 0) {  // log n
            if (array[index] >= sum) {
                to = index;
                break;
            }
            index = index / 2;
        }
        to = to < 0 ? len : to;

        List<Pair> pairs = new ArrayList<Pair>();
        for(int i = 0 ; i < to ; i++) {
            for(int k = i; k < to ; k++) {
                if (array[i] + array[k] == sum) {
                    pairs.add(new Pair(array[i], array[k]));
                }
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
