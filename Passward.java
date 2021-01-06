import java.io.Console;
public class Passward
{
	public static void main(String args[])
	{
		Console cons;
		if((cons= System.console()) !=null)
		{
			char[] pass_ward=null;
			try
			{
				pass_ward= cons.readPassword("input your Password");
				System.out.println("Your password was: " +new String(pass_ward));
			}
			finally
			{
				if(pass_ward !=null)
				{
					java.util.Arrays.fill(pass_ward,' ');
				}
			}
		}
		else
		{
			throw new RuntimeException("can't get password___ no conse");
		}
	}
}