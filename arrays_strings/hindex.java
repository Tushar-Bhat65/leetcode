import java.util.*;
class Solution {
    public int hIndex(int[] nums){
        int n=nums.length;
        //if(n==1 && nums[0]==0) return 0;
        //else if (n==1 && nums[0]==1) return 1;
        //else
        Arrays.sort(nums);
        int max=0;
        int i=n-1;
        while(i>=0){
            if(nums[i]>=(n-i)){
                max=Math.max(max,n-i);
                i--;
            }
            else i--;
        } return max; 
    }
    public static void main(String[] main){
        int nums[]={100};
        Solution sol=new Solution();
        int res=sol.hIndex(nums);
        System.out.print(res);
        
    }
}