
public class LongestCommonPrefix{

    // Method to find the longest common prefix among an array of strings
	public static String longestCommonPrefix(String[] strs) 
	{
         // Check if the array is null or empty
        if(strs == null || strs.length == 0) 
		{
            return "";
        }

        String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) 
		{
            while(strs[i].indexOf(prefix) != 0) 
			{
                prefix= prefix.substring(0, prefix.length()-1);
				if (prefix.isEmpty()) 
				{
                    return "";
                }
            }
        }
        // Return the longest common prefix found
        return prefix;
    }

 public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
		
		 // Call the longestCommonPrefix method
		String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
     }
   }
