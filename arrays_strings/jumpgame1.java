class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxJump=0;
        for(int i=0;i<n;i++){
            if(i>maxJump) return false;
            if(nums[i]+i>maxJump){
                maxJump=nums[i]+i;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        int nums[]={3,2,1,0,4};
        boolean res=sol.canJump(nums);
        if(res==true){
            System.out.print("End can be reached");
        }
        else System.out.print("Cant be reached");
    }
}