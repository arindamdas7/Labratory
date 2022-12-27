package abstractiondemo;

import java.util.Scanner;

public class Circle 
{
	final double pi = 3.14;
	
	public double calculateArea(double pi, int radius)
	{
		double area;
		area = pi * radius * radius;
		return area;
	}
	public double circum(double pi, int radius)
	{
		double cir;
		cir = 2 * pi * radius;
		return cir;
	}
	public static void main(String[] args) 
	{
		Circle circle  = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = sc.nextInt();
		double result = circle.calculateArea(circle.pi, r);
		System.out.println("Area of circle: "+result);
		double circumference = circle.circum(circle.pi, r);
		System.out.println("Circumference:"+circumference);

	}

}
