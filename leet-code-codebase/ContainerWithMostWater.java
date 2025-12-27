
public class ContainerWithMostWater{

    // Method to calculate the maximum amount of water the container can store
    public static int maxArea(int[] height) 
	{
        int left = 0;
		int right = height.length - 1;
		int maxWater = 0;

        // Continue until the two pointers meet
        while (left < right) 
		{
			int width = right - left;
			int minHeight = Math.min(height[left], height[right]);
	        int area = width * minHeight;
			maxWater = Math.max(maxWater, area);

            // Move the pointer with the smaller height
            if(height[left] < height[right]) 
			{
                left++;
            }
			else 
			{
                right--;
            }
        }

        // Return the maximum water that can be stored
         return maxWater;
     }

public static void main(String[] args){

        // Input array representing heights of vertical lines
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = maxArea(height);
		// Printing the maximum water that can be stored
        System.out.println("Maximum water: " + result);
     }
   }
