package com.bridgelabz.day7;

public class Binary {
	public void convertBinary(int num){
	     int binary[] = new int[25];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binary obj = new Binary();
	     System.out.println("Binary representation of 250: ");
	     obj.convertBinary(250);

	}
}