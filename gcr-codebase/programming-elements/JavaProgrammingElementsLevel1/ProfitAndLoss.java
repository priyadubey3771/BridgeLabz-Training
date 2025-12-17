//create a class ProfitAndLoss to calculate the Profit and loss based on cost price
public class ProfitAndLoss {

   public static void main (String args[]) {
      
	  //create variables and put the given values in them
	  int CostPrice = 129 ;
	  int SellingPrice = 191 ;
	  int Profit = SellingPrice - CostPrice ;
	  int Loss = CostPrice - SellingPrice ;
	  
	  //Displaying  cost price, selling price, profit and profit percentage  
	  System.out.println ("The Cost Price is INR " + CostPrice + " " + "and Selling Price is INR "+ SellingPrice + "\n" +
      "Calculated Profit is INR"+ " " + Profit + " " + "and the Profit Percentage is" + " " + (double)(Profit / CostPrice) * 100 ) ;
	  
   }
  }