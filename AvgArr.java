public class AvgArr
{
	public static void main(String args[])
	{
		double[] arr={7,36,9,12,45,6};
		double total=0;
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		double average = total/arr.length;
	System.out.format("The average is: %.3f", average);
	}
}

	