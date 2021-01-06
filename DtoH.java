import java.util.Scanner;
public class DtoH
{
	public static void main(String ar[])
	{
		int dn,rem;
		String hn=" ";
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner in=new Scanner(System.in);
		System.out.println("enter your Decial Number:");
		dn=in.nextInt();
		while(dn>0)
		{
			rem=dn%16;
			hn=hex[rem]+hn;
			dn=dn/16;
		}
		System.out.println("Hexadecimal number is: "+hn+"\n");
	}
}