
import java.util.Scanner;
public class Mcq{
   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
	  
	  // declaring string array of size 5 for 5 questions
	  String[] Questions = new String[5];
	  //initializing marks to store total score of a candidate
	  int marks =0;
	  System.out.println("Welcome to the Quiz ");
	  
	  // iterating loop for 5 questions
	  for(int i=0; i<Questions.length; i++)
	  {
		   // asking questions and suggesting choice and taking the answer as input from the user
	      if(i==0)
		  { 
				System.out.println("who is the father of the nation");
		        System.out.println("\n1) Mahatma Gandhi \n2) Jawaharlal Nehru \n3) Subhas Chandra Bose \n4) Bhagat Singh");
				int choice = sc.nextInt();
				switch(choice)
				             {
							    case 1:
								       {
									       System.out.println("Correct Answer");
										   marks = marks+1;
										   break;
									   }
								        
				                 case 2:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
				
	                              case 3:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
								  case 4:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
							    }
			}
			else if(i==1)
			{
			      System.out.println("What is the value of 2+2");
				  System.out.println("\n1) 3 \n2) 4 \n3) 7 \n4) 8");
				  int choice = sc.nextInt();
				  switch(choice)
				             {
							    case 1:
								       {
									       System.out.println("Wrong Answer");
										   break;
									   }
								        
				                 case 2:
								       {
									       System.out.println("Correct Answer");
										   marks = marks+1;
									        break;
									   }
				
	                              case 3:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
								  case 4:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
							    }
			}
			else if(i==2)
			{
			      System.out.println("How many bones are there in the human body");
				  System.out.println("\n1) 302 \n2) 216 \n3) 515 \n4) 206");
				  int choice = sc.nextInt();
				  switch(choice)
				             {
							    case 1:
								       {
									       System.out.println("Wrong Answer");
										   break;
									   }
								        
				                 case 2:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
				
	                              case 3:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
								  case 4:
								       {
									       System.out.println("Correct Answer");
										   marks = marks+1;
									        break;
									   }
							    }
			}
			else if(i==3)
			{
			      System.out.println("Largest lake of India");
				  System.out.println("\n1) Vembanad Lake \n2) Dal Lake \n3) Chilika Lake \n4) Loktak Lake");
				  int choice = sc.nextInt();
				  switch(choice)
				             {
							    case 1:
								       {
									       System.out.println("Wrong Answer");
										   break;
									   }
								        
				                 case 2:
								       {
									       System.out.println("Right Answer");
										   marks = marks+1;
									       break;
									   }
				
	                              case 3:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
								  case 4:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
							    }
			}
			else
			{
			      System.out.println("Who is our national animal");
				  System.out.println("\n1) Lion \n2) Peacock \n3) Tiger \n4) Cheetah");
				  int choice = sc.nextInt();
				  switch(choice)
				             {
							    case 1:
								       {
									       System.out.println("Wrong Answer");
										   break;
									   }
								        
				                 case 2:
								       {
									       System.out.println("Wrong Answer");
									       break;
									   }
				
	                              case 3:
								       {
									       System.out.println("Correct Answer");
										    marks = marks+1;
									        break;
									   }
								  case 4:
								       {
									       System.out.println("Wrong Answer");
									        break;
									   }
							    }
			}
		}
		// displaying the total score of a candidate
		 System.out.println("\nYour total correct Answers out of 5 is:" + marks);
		sc.close();
	}
}