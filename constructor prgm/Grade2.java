class Grade2
{
	Grade2()
	{
		int sub11=50,sub12=45, sub13=40;
		int sub21=46, sub22=42, sub23=49;
		System.out.println("the three subject marks are" +sub11 +" " +sub12 + " " +sub13);
		System.out.println("the three subject marks are" + sub21 + " " +sub22 + " " +sub23);
	}
	public static int totalMarkOfStudent1(int sub11, int sub12, int sub13)
	{
		int total1=(sub11+sub12+sub13);
		return total1;
	}
	public static int totalMarkOfStudent2(int sub21, int sub22, int sub23)
	{
		int total2=(sub21+sub22+sub23);
		return total2;
	}
	public static void gradeOfStudent1(int sub11, int sub12, int sub13)
	{
		float avg1=(sub11+sub12+sub13)/3;
		if((avg1<=50)&&(avg1>=40))
		{
			System.out.println("the student get A grade");
		}
		else if((avg1<40)&&(avg1>=30))
		{
			System.out.println("the student get B grade");
		}
		else if((avg1<30)&&(avg1>=20))
		{
			System.out.println("the student get C grade");
		}
	}
	public static void gradeOfStudent2(int sub21, int sub22, int sub23)
	{
		float avg2=(sub21+sub22+sub23)/3;
		if((avg2<=50)&&(avg2>=40))
		{
			System.out.println("the student get A grade");
		}
		else if((avg2<40)&&(avg2>=30))
		{
			System.out.println("the student get B grade");
		}
		else if((avg2<30)&&(avg2>=20))
		{
			System.out.println("the student get C grade");
		}
	}
	public static void main(String args[])
	{
		Grade2 obj=new Grade2();
		System.out.println(Grade2.totalMarkOfStudent1(50,45,40));
		System.out.println(Grade2.totalMarkOfStudent2(46,42,49));
		Grade2.gradeOfStudent1(50,45,40);
		Grade2.gradeOfStudent2(46,42,49);
	}
}
	