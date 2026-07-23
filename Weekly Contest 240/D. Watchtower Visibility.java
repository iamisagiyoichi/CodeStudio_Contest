import java.util.Stack;
public class Solution {
    public static int[] watchtowerVisibility(int[] heights){
        // Write your code here
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int cnt = 0;
            while(!st.isEmpty() && heights[i]>st.peek()){
                st.pop();
                cnt++;
            }
            if(!st.isEmpty())cnt++;
            ans[i] = cnt;
            st.push(heights[i]);
        }
        return ans;
    }

}
