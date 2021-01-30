import java.util.Scanner;
class Grade
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int marks;
		char grade;
		System.out.println("Enter marks");
		marks= obj.nextInt();
		if(marks>=85)
		{
			grade ='A';
		}
		else if(marks>=75)
		{
			grade='B';
		}
		else if(marks>=65)
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		System.out.println("grade="+grade);
	}
}