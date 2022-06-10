class Average2
{
	Average2(int a,int b, int c)
	{
		int d=(a+b+c)/3;
		System.out.println(d);
		
	}
	Average2(float e,float f, float g)
	{
		float h=(e+f+g)/3;
		System.out.println(h);
	}
	
	public static void main(String args[])
	{
		
		Average2 obj1=new Average2(10,20,30);
		Average2 obj2=new Average2(10f,20f,30f);
		
		
	}
}