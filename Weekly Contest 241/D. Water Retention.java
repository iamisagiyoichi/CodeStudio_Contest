import java.util.*;

public class Solution {

    public static int trap(ArrayList<Integer> height) {
        // Write your code here
        int  l = 0, r = height.size()-1;
        int lm = 0 , rm = 0;
        int ans = 0;
        while(l <= r){
            if(height.get(l) <= height.get(r)){
                if(height.get(l) >= lm){
                    lm= height.get(l);
                }
                else{
                    ans += lm - height.get(l);
                }
                l++;
            }
            else{
                if(height.get(r) >= rm){
                    rm = height.get(r);
                }
                else{
                    ans += rm - height.get(r);
                }
                r--;
            }
        }
        return ans;
    }
}
