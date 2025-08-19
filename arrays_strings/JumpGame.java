/*
 Jump Game - sample solution (Java)
 O(n) greedy implementation with simple main() to test.
*/
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame s = new JumpGame();
        int[] a1 = {2,3,1,1,4};
        int[] a2 = {3,2,1,0,4};
        System.out.println("a1 -> " + s.canJump(a1)); // true
        System.out.println("a2 -> " + s.canJump(a2)); // false
    }
}
