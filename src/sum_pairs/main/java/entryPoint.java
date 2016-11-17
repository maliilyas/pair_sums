package src.sum_pairs.main.java;

public class entryPoint {

    public static void main(String[] arg) {
        final int[] array = { 1, -2, 7, 5, 0 , -3 , 10 , 2 , 5 , 1, 6 , -2};
        final int sum = 5;
        findPairs.printPairs(findPairs.findAllPairsEqualToSumBigO_N(sum, array));
        findPairs.printPairs(findPairs.findAllPairsEqualToSumBigO_N2(sum, array));


    }

}
