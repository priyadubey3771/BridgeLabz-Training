
import java.util.Scanner;
public class MovieTicketBooking{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 int actionMovieTotalGoldSeat = 20;
	 int actionMovieTotalSilverSeat = 30;
	 int allTotalActionMovie = 50;
	 int romanticMovieTotalGoldSeat = 20;
	 int romanticMovieTotalSilverSeat = 30;
	 int allTotalRomanticMovie = 50;
	 int allTotal = 100; 
	 int choice =0;
	 
	 while(choice!=3 && allTotal!=0)
	 {
	    System.out.println("Enter task you want perform");
		System.out.println("1.Book movie ticket");
		System.out.println("2.Check seat availability");
		System.out.println("3.Exit");
		choice = sc.nextInt();
		int totalAmount = 0;
		
		switch(choice)
		{
		    case 1:
			       {
				      System.out.println("What type of movie you want to see");
					  System.out.println("1.Action movie");
					  System.out.println("2.Romantic movie");
					  int movieChoice = sc.nextInt();
					  boolean ticketBooked = false;
					  
					  switch(movieChoice)
					        {
							   case 1:
							   {
							           if(allTotalActionMovie>0)
									
							         {
									   System.out.println("Which seat do you want to book?");
									   System.out.println("1.Gold(Rs.400)");
									   System.out.println("2.Silver(Rs.300)");
									   int seatType = sc.nextInt();
									   
									   switch(seatType)
									       {
										     case 1:
											      {  
												     if( actionMovieTotalGoldSeat>0)
													 {
												     System.out.println("Ticket booked successfully");
													  totalAmount = 400;
													  allTotal--;
													  actionMovieTotalGoldSeat--;
													  allTotalActionMovie--;
													  ticketBooked = true;
													 }
													 else
													 {
														System.out.println("Gold Tickets not available");
													 }
													 break;
												  }
											  case 2:
											      {
													  if( actionMovieTotalSilverSeat>0)
													 {	  
												      System.out.println("Ticket booked successfully");
													  totalAmount = 300;
													  allTotal--;
													  actionMovieTotalSilverSeat--;
													  allTotalActionMovie--;
													  ticketBooked = true;
													 }
													 else
													 {
														 System.out.println("Silver Tickets not available");
											
													 }
													 break;
												  }
											  default :
                                                   {
                                                       System.out.println("You entered the wrong choice");
													   
													  
												   }  
										   }
									 }
										     else
											 { 
										         System.out.println("Tickets not available");
											 }
											 break;
							   }
									 
												    
												  
											
                                case 2:
								     {
								        if(allTotalRomanticMovie>0)
								  
							          {
									   System.out.println("Which seat do you want to book?");
									   System.out.println("1.Gold(Rs.400)");
									   System.out.println("2.Silver(Rs.300)");
									   int seatType = sc.nextInt();
									   
									   
									   switch(seatType)
									       {
										     case 1:
											      {
													  if(romanticMovieTotalGoldSeat>0)
													  {
												       System.out.println("Ticket booked successfully");
													   totalAmount = 400;
													   allTotal--;
													   romanticMovieTotalGoldSeat--;
													   allTotalRomanticMovie--;
													   ticketBooked = true;
													  }
													  else
													  {
														 System.out.println("Gold Tickets not available");
												
													  }
													  break;
													  
												  }
											  case 2:
											      {
													 if(romanticMovieTotalSilverSeat>0)
													 {
												       System.out.println("Ticket booked successfully");
													   totalAmount = 300;
													   allTotal--;
													   romanticMovieTotalSilverSeat--;
													   allTotalRomanticMovie--;
													   ticketBooked = true;
													 }
													 else
													 {
														 System.out.println("Silver Tickets not available");
														 
													 }
													   break;
												  }
											  default :
                                                   {
                                                       System.out.println("You entered the wrong choice");
													   break;
													  
												   }  
										   }
									  }
									  else
									  {
										  System.out.println("Tickets not available");
									  }
									   break;
									}
									
									 default :
									       {
										       System.out.println("You entered the wrong choice");
											   break;
										   }
							}
												   
										    if(ticketBooked==true)
											 {											  
												 boolean snackoption = true;
												 while(snackoption==true)
												 {
													System.out.println("Do you want any snacks(Y/N)?");
													char wantSnack = sc.next().charAt(0);
													if( wantSnack =='y' || wantSnack =='Y')
												   {
												     System.out.println("Which snack do you want");
													 System.out.println("1.Burger(Rs. 80)");
													 System.out.println("2.French Fries(Rs. 50)");
													 System.out.println("3.Coke(Rs.40)");
													 System.out.println("4.Sandwich(Rs.100)");
													 int snackChoice = sc.nextInt();
													 
													 switch(snackChoice)
													                   {
																	     case 1:
																		       {
																			      System.out.println("You booked Burger successfully");
																				  totalAmount = totalAmount + 80;
																				  break;
																				}
												                          case 2:
																		       {
																			      System.out.println("You booked French Fries successfully");
																				  totalAmount = totalAmount + 50;
																				  break;
																				}
										                                  case 3:
																		       {
																			      System.out.println("You booked Coke successfully");
																				  totalAmount = totalAmount + 40;
																				  break;
																				}
																		   case 4:
																		       {
																			      System.out.println("You booked Sandwich successfully");
																				  totalAmount = totalAmount + 100;
																				  break;
																				}
																			default : 
																			   {
																				   System.out.println("Invalid snack");
																				    break;
									                                           }
																	   }
										            }
													else if( wantSnack =='n' || wantSnack =='N')
													{
													    System.out.println("OK! Exiting the snack option");
														snackoption = false;
														
													}
													else
													{
													     System.out.println("You entered the wrong choice try again");
									                }
										   
									        }
											
                                             System.out.println("Total Amount to Pay: Rs." + totalAmount);
											
											}
										 break;
										}
								   
				
                                   
		    case 2:
			       {
				       System.out.println("press 1 to check seat availability for action movie");
					   System.out.println("press 2 to check seat availability for romantic movie");
					   int seatAvailabilityCheck = sc.nextInt();
					   
					   switch(seatAvailabilityCheck)
					   {
					    case 1:
						      {
								 System.out.println("Total available seat for action movie is:"+ allTotalActionMovie);
								 System.out.println("Total available Gold seat for action movie is: " + actionMovieTotalGoldSeat);
								 System.out.println("Total available Silver seat for action movie is: " + actionMovieTotalSilverSeat);
                                  break;
							  }
						 case 2:
						      {
							     System.out.println("Total available seat for romantic movie is:"+ allTotalRomanticMovie);
								 System.out.println("Total available Gold seat for romantic movie is: " + romanticMovieTotalGoldSeat);
								 System.out.println("Total available Silver seat for romantic movie is: " + romanticMovieTotalSilverSeat);
								 break;
							  }
						case 3:	
						      {
							     System.out.println("You entered the wrong choice");
								 break;
							  }
							
					    }
						break;
					}
			   case 3:
                    {
                        	System.out.println("you exited successfully");
							break;
					}
			  default:
			         {
					        System.out.println("You entered the wrong choice");
						    break;
					 }
					 
		}
      }	
      sc.close();	  
		}
      }		