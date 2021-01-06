import java.util.Scanner;
class BtoD
{
	public static void main(String ar[])
	{
		int dn,quot,i=1,j;
		int bn[]=new int[100];
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Decimal Number:");
		dn=scan.nextInt();
		quot=dn;
		while(quot!=0)
		{
			bn[i++]=quot%2;
			quot=quot/2;
		}
		System.out.print("Binary number is:");
		for(j=i-1;j>0;j--)
		{
			System.out.print(bn[j]);
		}
		
	}
}