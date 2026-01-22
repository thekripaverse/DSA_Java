package LeetCode;

public class Smallerthan {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] count=new int[n];
        int k=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (nums[i] > nums[j]){
                    count[k]+=1;
                }
            }
            k+=1;
        }
        return count;
    }
}

/*
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
*/
