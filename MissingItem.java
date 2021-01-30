public class MissingItem
{
	public static void main(String args[])
	{
		int[] arr={8,5,6,1,4,3,2};
		System.out.println("Missing item  from the array : "+ MissingNum(arr));
	}
	public static int MissingNum(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for(int i=0;i<arr.length;i++)
		{
			restSum+=arr[i];
		}
		int MissingNum =sum-restSum;
		return MissingNum;
	}
}
	