
public class TwoSumArray {

    // Method to find indices of two numbers whose sum equals the target
    public static int[] twoSum(int[] nums, int target) 
	{
		// Check every pair using loops
        for (int i=0; i<nums.length; i++) 
		{
            for (int j= i+1; j<nums.length; j++) 
			{
				if (nums[i] + nums[j] == target) 
				{
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

 public static void main(String[] args){

        int[] nums = {2, 7, 11, 15};
        int target = 9;
		 // Calling the twoSum method
		int[] result = twoSum(nums, target);

        // Print the result indices
        System.out.println("Indices: " + result[0] + ", " + result[1]);
     }
  }
