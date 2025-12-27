
public class MedianOfTwoSortedArrays{

    // Method to find the median of two sorted arrays
	public static double findMedianSortedArrays(int[] nums1, int[] nums2){

        if (nums1.length > nums2.length) 
		{
            return findMedianSortedArrays(nums2, nums1);
        }

        // Lengths of both arrays
        int m = nums1.length;
        int n = nums2.length;

        // Binary search on the smaller array
        int low = 0, high = m;

        // Performing binary search
        while (low <= high) 
		{
			int cut1 = (low + high) / 2;
			int cut2 = (m + n + 1) / 2 - cut1;
			int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1-1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2-1];
			int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            // Check if valid partition is found
            if (left1 <= right2 && left2 <= right1) 
			{
				// If total length is even, median is average of two middle elements
                if ((m + n)%2 == 0) 
				{
                    return (Math.max(left1, left2) + Math.min(right1, right2))/ 2.0;
                } 
                // If total length is odd, median is the max of left elements
                else 
				{
                    return Math.max(left1, left2);
                }
            } 
			
            // Move partition left in nums1
            else if (left1 > right2) 
			{
                high= cut1 - 1;
            }
			
            // Move partition right in nums1
            else 
			{
                low= cut1 + 1;
            }
        }

        return 0.0;
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Input sorted arrays
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        // Call the method to find median
        double median = findMedianSortedArrays(nums1, nums2);

        // Print the median
        System.out.println("Median: " + median);
      }
   }
