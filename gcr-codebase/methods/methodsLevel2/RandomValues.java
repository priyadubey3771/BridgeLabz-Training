
public class RandomValues {

      // method that generates array of 4 digit random numbers
      public int[] generate4DigitRandomArray(int size) 
	  {
        int[] arr= new int[size];
        for (int i= 0; i<size; i++) 
		{
            arr[i]= (int)(Math.random() * 9000) + 1000;
        }
        return arr;
      }

    // method to find average, min and max value of an array
    public double[] findAverageMinMax(int[] numbers) 
	{
        int min= numbers[0];
        int max= numbers[0];
        int sum= 0;

        for (int num : numbers) 
		{
            sum+= num;
            min= Math.min(min,num);
            max= Math.max(max,num);
        }

        double average = (double)sum/numbers.length;
        return new double[]{average, min,max};
    }

   public static void main(String[] args) 
	{
        RandomValues value= new RandomValues();
		int[] numbers= value.generate4DigitRandomArray(5);
        double[] result= value.findAverageMinMax(numbers);

         // displaying the result
        for (int num: numbers) 
		{
            System.out.println(num);
        }

        System.out.println(result[0]);
        System.out.println((int) result[1]);
        System.out.println((int) result[2]);
    }
}
