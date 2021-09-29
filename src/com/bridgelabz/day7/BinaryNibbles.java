package com.bridgelabz.day7;

import java.util.Scanner;

public class BinaryNibbles {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal,binary=0,reminder,temp=1;
        System.out.println("Enter a Decimal Number : ");
        decimal = sc.nextInt();
        System.out.println("after swap nibble : "+swapNibbles(decimal));
        while (decimal!=0){
            reminder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("The Binary Number is : "+binary);
    }
    static int swapNibbles(int decimal)
    {
        return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);
    }

}