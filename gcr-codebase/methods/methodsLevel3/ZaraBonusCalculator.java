
public class ZaraBonusCalculator{

	//Method to generate salary and years of service for 10 employees
	public static double[][] generateEmployeeData()
	{
		double[][] data=new double[10][2];
		for(int i=0; i<10;i++)
		{
			data[i][0]=(int)(Math.random()*90000)+10000;
			data[i][1]=(int)(Math.random()*11);
		}
		return data;
	}
	//Method to calculate bonus and new salary
	public static double[][] calculateBonusAndNewSalary(double[][] data)
	{
		double[][] result=new double[10][2];
		for(int i=0;i<10;i++)
		{
			double salary=data[i][0];
			double years=data[i][1];
			double bonus;
			if(years>5)
			{
				bonus=salary*0.05;
			}
			else
			{
				bonus=salary*0.02;
			}
			result[i][0]=salary+bonus;
			result[i][1]=bonus;
		}
		return result;
	}
	//Method to calculate and display totals in tabular format
	public static void displaySummary(double[][] oldData,double[][] newData)
	{
		double totalOldSalary=0;
		double totalNewSalary=0;
		double totalBonus=0;
		System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");

		for(int i=0;i<10;i++)
		{
			double oldSalary=oldData[i][0];
			double years=oldData[i][1];
			double bonus=newData[i][1];
			double newSalary=newData[i][0];
			totalOldSalary+= oldSalary;
			totalNewSalary+= newSalary;
			totalBonus+= bonus;
			System.out.println((i+1)+"\t"+oldSalary+"\t"+years+"\t"+bonus+"\t"+newSalary);
		}
		System.out.println("Total Old Salary: "+totalOldSalary);
		System.out.println("Total Bonus Paid: "+totalBonus);
		System.out.println("Total New Salary: "+totalNewSalary);
	}
 public static void main(String[] args){

    double[][] employeeData=generateEmployeeData();
	double[][] updatedData=calculateBonusAndNewSalary(employeeData);
	displaySummary(employeeData,updatedData);

	 }
   }
