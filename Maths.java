import java.util.Arrays;

public class Maths {

	//1s and 0s will be stored in this area, up to 100 places
	static int bi[] = new int[100];

	public static String getBinary(int num) {
		String answer ="";
		int i = 0;
		
		//while num is greater than 0, basically
		while(num!=0) {
			
			//if remainder, bi[i]=1, if no remainder, bi[i] = 0
			bi[i] = num%2;
			//			System.out.println(bi[i]);
			//cut num in half
			num = num/2;
			//iterate to the next position of the array
			i++;
		}
		
		
		for(int j=i-1; j>=0; j--) {
			//			System.out.print(bi[j]);
			answer += bi[j];
		}		
		System.out.println(answer);
		return answer;
	}
	/* 
	* the hex to binary basically uses a switch case and puts all the possible hex chars
	*
	*
	*/
	public static String getHexToBinary(String input) {
		
		String num="";
		String answer="";

		for(int i=0; i<input.length();i++){
			switch(input.charAt(i)) {
				case '1':
				num = "0001";
				break;
				case '2':
				num = "0010";
				break;
				case '3':
				num = "0011";
				break;
				case '4':
				num = "0100";
				break;
				case '5':
				num = "0101";
				break;
				case '6':
				num = "0110";
				break;
				case '7':
				num = "0111";
				break;
				case '8':
				num = "1000";
				break;
				case '9':
				num = "1001";
				break;
				case 'A':
				num="1010";
				break;
				case 'B':
				num="1011";
				break;
				case 'C':
				num="1100";
				break;
				case 'D':
				num="1101";
				break;
				case 'E':
				num="1110";
				break;
				case 'F':
				num="1111";
				break;
				default: answer += "INVALID INPUT. TRY AGAIN.";
				System.out.println(answer);
				return answer;
			}
			answer+=num;

		}	
		System.out.println(answer);
		return answer;
		
	}

	public static long getFibIndex(long num){
		long x=0, y=1, z;
		if(num ==0){
			return num;
		}
		for(int i=2; i<= (int)num; i++){
			z = x + y;
			x = y;
			y = z;
		}
		System.out.println(y);
		return y;

	}
}
