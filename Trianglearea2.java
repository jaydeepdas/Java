class Triangle
{
	double a,b,c,area;
	Triangle(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	Triangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	double area_cal1()
	{
		double s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	double area_cal2()
	{
		area=0.5F*a*b;
		return area;
	}
}

class Trianglearea2
{
	public static void main(String args[])
	{
		Triangle T1=new Triangle(10,5,6);
		Triangle T2=new Triangle(10,5);
		double area1=T1.area_cal1();
		double area2=T2.area_cal2();
		System.out.println("Area of triangle1 is="+area1);
		System.out.println("Area of triangle2 is="+area2);
	}
}