package com.day5;

public class Overlaoding {
	public int multiplyNumber(int a,int b) {
		return a*b;
	}
	public int multiplyNumber(int a, int b,int c)
	{
		return a*b*c;
	}
	public double multiplyNumber(double a,int b)
	{
		return a*b;
	}
	public double multiplyNumber(double a,int b,int c,int d)
	{
		return a*b*c*d;
	}

	public static void main(String[] args) {
		Overlaoding mul=new Overlaoding();
		int w=9, x=6, y=9, z=12;
        System.out.println(mul.multiplyNumber(x,y));
        System.out.println(mul.multiplyNumber(x,y,z));
        System.out.println(mul.multiplyNumber(x,y));
        System.out.println(mul.multiplyNumber(w,x,y,z));
	}

}
