import java.util.Scanner;
public class Binaary
{
	public static void main(String ar[])
	{
		int dec,quot,i=1,j;
		int bin[] = new int[100];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a decimal number: ");
		dec = scan.nextInt();
		quot =dec;
		while(quot ! = 0)
		{
			bin[i++] = quot%2;
			quot = quot/2;
		}
		System.out.print("Binary number is :");
		for(j=i-1;j>0;j--)
		{
			System.out.print(bin[j]);
		}
		System.out.println("\n");
	}
}