import java.util.InputMismatchException;
import java.util.Scanner;

public class biCalc {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the decimal to binary calculator!");
		
		fun();
		
	}
	
	public static int fun() {
		

        Scanner keyboard = new Scanner(System.in);
		try{
			System.out.println("Enter a number: ");
			int num = keyboard.nextInt();

			
			if(num == 0) {
				keyboard.close();
				return num;
			}
			
			Maths calculateToBinary = new Maths();
			calculateToBinary.getBinary(num);
			return fun();

		}catch(InputMismatchException e){
			// System.out.println(e.fillInStackTrace());
			System.out.println("INVALID INPUT. EXITING...");
			return 0;
		}finally{
			keyboard.close();
		}
	}
	

}
