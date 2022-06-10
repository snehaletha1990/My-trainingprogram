import java.util.Scanner;
class Fact1
{
	
	Fact1(int a)
	{
		int fact=1;
		for(int i=1; i<=a; i++)
		{
			
			fact=fact*i;
		
		
		}
		System.out.println(fact);
	}
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number");
		int a=r.nextInt();
		Fact1 obj=new Fact1(a);
	}
}
		