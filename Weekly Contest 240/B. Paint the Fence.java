import java.util.*;
public class Solution {
    public static long paintFence(int n, int k){
        // Write your code here
        if(n == 1) return k;
        if(n == 2) return 1L*k*k;
        long same = k;
        long diff = 1L*k*(k-1);
        for(int i=3;i<=n;i++){
            long newSame = diff;
            long newDiff = (same+diff)*(k-1);
            same = newSame;
            diff = newDiff;
        }

        return same + diff;
    }

}
