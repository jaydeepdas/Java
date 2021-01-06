import java.util.Scanner;
class VorC
{
	public static void main(String args[])
	{
		boolean isVowel=false;;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a Character: ");
		char ch=scanner.next().charAt(0);
		scanner.close();
		switch(ch)
		{
			case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel=true;
		}
		if(isVowel == true)
		{
			System.out.println(ch+"is a vowel");
		}
		else
		{
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println(ch+" is a Consonant");
	   else
		System.out.println("Input is not an alphabet");		
		}
	}
}
                