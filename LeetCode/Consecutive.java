package LeetCode;

public class Consecutive {
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int current=0;
	        int Maxc=0;
	        for (int i=0;i<nums.length;i++){
	            if (nums[i]==1){
	                current+=1;
	                Maxc=Math.max(Maxc,current);
	            }
	            else{
	                current=0;
	            }
	        }
	        return Maxc;
	    }
}

/*
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
*/