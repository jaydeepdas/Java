import java.util.*;
public class Hms
{
	public static void main(String ar[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input Second: ");
		int seconds=in.nextInt();
		int p1=seconds%60;
		int p2=seconds/60;
		int p3=p2 %60;
		p2=p2/60;
		System.out.println(p2+":"+p3+":"+p1);
		System.out.print("\n");
	}
}