public class EqualArr
{
	public static void main(String args[])
	{
		int[] arr1= {3,7,9,11,14};
		int[] arr2= {3,7,5,11,14};
		int[] arr3= {3,7,9,11,14};
		
		equality_checking(arr1,arr2);
		equality_checking(arr1,arr3);
	}
	static void equality_checking(int[] my_arr1, int[] my_arr2)
	{
		boolean equalOrNot =true;
		if(my_arr1.length == my_arr2.length)
		{
			for(int i=0;i<my_arr1.length; i++)
			{
				if(my_arr1[i] != my_arr2[i])
				{
					equalOrNot =false;
				}
			}
		}
		else
		{
		equalOrNot=false;
		}
		if(equalOrNot)
		{
		System.out.println("Two arrays are Equal. ");
		}
		else
		{
		System.out.println("Two arrays are not Equal.");
		}
	}
}	
		