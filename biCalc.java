package binaryCalc;

import java.util.Scanner;

public class biCalc {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the decimal to binary calculator!");
		
		fun();
		
	}
	
	public static int fun() {
		

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = keyboard.nextInt();
        
        if(num == 00000) {
        	return num;
        }

        Maths calculateToBinary = new Maths();
        
		calculateToBinary.getBinary(num);
		
		
		return fun();
	}
	

}
