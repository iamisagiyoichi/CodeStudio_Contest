import java.util.*;
public class Solution {
    static long sum(long n, long d){
        long k = n/d;
        return d*k*(k+1)/2;
    }

    public static long exclusiveMultiples(long n) {
        // Write your code here
        return sum(n, 3)+sum(n,5)+sum(n,7)-2L*sum(n,15)-2L*sum(n,21)-2L*sum(n,35)+3L*sum(n,105);
    }
}
