import java.util.Scanner;
class Reverse3
{
	int reverse=0, remainder=0;
	int n;
	Reverse3(int n)
	{
		this.n=n;
	}
	Reverse3()
	{
		this(127);
		while(n!=0)
		{
			remainder=n%10;
			reverse=(reverse*10)+remainder;
			n=n/10;
		}
	}
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number");
		int n=r.nextInt();
		Reverse3 obj=new Reverse3();
		System.out.println("the reverse number is : " +obj.reverse);
	}
}