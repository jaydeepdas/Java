import java.util.Scanner;
public class SandM
{

	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=0 ,mul=1;
	if(a<b)
	{
		for(int i=a+1;i<b;i++)
		{
			sum=sum+i;
			mul=mul*i;
		}
		System.out.print("sum: "+  sum +"mul:"+ mul);
	}
}
		