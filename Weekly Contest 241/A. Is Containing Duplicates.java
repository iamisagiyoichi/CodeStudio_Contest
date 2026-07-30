/* Time Complexity: O(n)
   Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static boolean containsDuplicate(ArrayList<Integer> nums) {

        // Write your code here.
        HashSet<Integer>set = new HashSet<>();
        for(int x:nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }

        return false;
    }
}
