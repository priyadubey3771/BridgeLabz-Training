
public class OTPGenerator{

	//Method to generate a 6-digit OTP using Math.random()
		public static int generateOTP()
		{
			int otp=(int)(Math.random()*900000)+100000;
			return otp;
		}
	//Method to check whether all OTPs are unique
		public static boolean areOTPsUnique(int[] otps)
		{
			for(int i=0;i<otps.length;i++)
			{
				for(int j=i+1;j<otps.length;j++)
				{
					if(otps[i]==otps[j])
					{
						return false;
					}
				}
			}
		 return true;
		}

		
   public static void main(String[] args){
		//Array to store 10 OTP numbers
		int[] otps=new int[10];
		//Generating OTPs and storing in array
		for(int i=0; i<otps.length; i++)
		{
			otps[i]= generateOTP();
		}

		//Displaying generated OTPs
		System.out.println("Generated OTPs:");
		for(int i=0;i<otps.length;i++)
		{
			System.out.println(otps[i]);
		}

		//Checking uniqueness of OTPs
		if(areOTPsUnique(otps))
		{
			System.out.println("All OTPs are unique");
		}
		else
		{
			System.out.println("Duplicate OTPs found");
		}
	  }
	}
