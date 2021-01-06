import java.util.Scanner;
public class SoD
{
	public static void main(String ar[])
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter an Integer no: ");
		long n = input.nextLong();
		System.out.println("The sum of Digits is:"+ SumDig(n));
	}
	
	public static int SumDig(long n)
	{
		int sum=0;
		while(n!=0)
		{
			sum +=n%10;
			n/=10;
		}
		return sum;
	}
}