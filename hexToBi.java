import java.util.Scanner;

public class hexToBi {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Hexadecimal to binary calculator!");
		
		hexaD();
	}
		
		public static String hexaD() {
			

	        Scanner keyboard = new Scanner(System.in);

	        System.out.println("Enter a number: ");
	        String input  = keyboard.nextLine();
	        
	        if(input.equals("00000")) {
				keyboard.close();
	        	return input;
	        }

	        Maths calculateToBinary = new Maths();
	        
			calculateToBinary.getHexToBinary(input);

			return hexaD();
	}

}
