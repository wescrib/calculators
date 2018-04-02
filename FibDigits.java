import java.util.InputMismatchException;
import java.util.Scanner;

public class FibDigits{
    public static void main(String[] args){
        System.out.println("Welcome to the Fibonnacci calculator!");
        fibIndex();
    }
    
    public static long fibIndex(){
        Scanner keyboard = new Scanner(System.in);
        try{
            System.out.println("Enter a number to get the index in the Fibonacci sequence");
            long num = keyboard.nextLong();

            if(num == 0){
                keyboard.close();
                System.out.println("Thanks, bye!");
                return num;
            }
            // Maths fibCalc = new Maths();
            Maths.getFibIndex(num);
            return fibIndex();
        }catch(InputMismatchException e){
            keyboard.close();
            System.out.println("INVALID INPUT. KEYBOARD CLOSED. EXITING...");
            return -1;
        }finally{
            keyboard.close();
        }
    }
}