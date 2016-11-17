package src.sum_pairs.main.java;

public class Pair {

    private final Integer a;
    private final Integer b;
    
    public Pair(final int a, final int b) {
        this.a = a;
        this.b =b;
    }
    
    public int getA() {
        return this.a;
    }
    
    public int getB() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object obj) {
        return false;
    }
}
