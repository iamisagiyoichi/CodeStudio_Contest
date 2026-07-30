import java.util.*;

public class Solution {

    public static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1,ArrayList<Integer> arr2) {
        ArrayList<Integer>ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                ans.add(arr1.get(i));
                i++;
            }
            else{
                ans.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            ans.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            ans.add(arr2.get(j));
            j++;
        }
        return ans;
    }
}
