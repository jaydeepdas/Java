public class Reverse
{
	static void revArr(int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void printArr(int arr[] ,int size)
	{
		for(int i=0;i<size;i++)
		System.out.print(arr[i]+ " ");
		System.out.println();
	}

public static void main(String ar[])
	{
		int arr[]={1,2,3,4,5,6};
		printArr(arr, 6);
		revArr(arr,0,5);
		System.out.println("Reversed array is\n");
		printArr(arr,6);
	}
}

		