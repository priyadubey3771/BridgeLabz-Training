
public class SpringSeason{
	
	//find whether spring season or not
    boolean isSpringSeason(int month,int day)
	{
	
        if((month== 3 && day>= 20) ||(month>3 && month<6) ||(month== 6 && day<=20))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

 public static void main(String[] args)
    {
		// taking month and day as input from the user
        int month= Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // passing month and day as arguments
        SpringSeason obj = new SpringSeason();
		boolean result = obj.isSpringSeason(month,day);

        // checking if it is spring season or not and displaying the result
        if(result)
        {
            System.out.println("Its a Spring Season");
        }
        else
        {
            System.out.println("Not a Spring Season");
        }
       }
     }
