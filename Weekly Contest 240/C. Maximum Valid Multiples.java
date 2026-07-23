import java.util.*;
public class Solution {
    public static long maximumValidMultiple(long value,long step){
        // Write your code here
        if(step<=0)return 0;
        long ans = 0;
        while(value >= step){
            value -= step;
            ans += step;
        }

        return ans;
    }
}
