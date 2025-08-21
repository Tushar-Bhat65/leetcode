class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int maxJump=0;
        int jumps=0;
        int currentEnd=0;
        for(int i=0;i<n;i++){
            if(nums[i]+i>maxJump){
                maxJump=nums[i]+i;
            }
            if(i==currentEnd){
                jumps++;
                currentEnd=maxJump;
            }
            if(currentEnd>=(n-1)) break;
        }
        return jumps;
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        int nums[]={7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        int res=sol.jump(nums);
        System.out.print("End reached in" +res);
    }
}