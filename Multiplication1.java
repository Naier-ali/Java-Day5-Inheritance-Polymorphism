package com.day5;

public class Multiplication1 {
	  
	  public int multiplyNumbers(int a, int b) {
	    return a * b;
	  }
	  
	  public int multiplyNumbers(int a, int b, int c) {
	    return a * b * c;
	  }
	  
	  public int multiplyNumbers(int a, int b, int c, int d) {
	    return a * b * c * d;
	  }
	  
	  public static void main(String[] args) {
	    Multiplication1 multiplication = new Multiplication1();
	    
	    int result1 = multiplication.multiplyNumbers(2, 3);
	    System.out.println("Result 1: " + result1);
	    
	    int result2 = multiplication.multiplyNumbers(2, 3, 4);
	    System.out.println("Result 2: " + result2);
	    
	    int result3 = multiplication.multiplyNumbers(2, 3, 4, 5);
	    System.out.println("Result 3: " + result3);
	  }
	}
