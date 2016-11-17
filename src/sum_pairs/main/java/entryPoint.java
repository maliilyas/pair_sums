package sum_pairs.main.java;

public class entryPoint {
    
    public static void main(String [] arg) {
        final int [] array = {1,-2,-1,5,4,0,10,3,7,23,98,34,5,6,34,1,29,54,3,2,7,8,-12,1};
        final int sum = 5;
        findPairs.printPairs(findPairs.findAllPairsEqualToSum(sum, array));
    }

}
