import java.util.Arrays;

public class Maths {

	//1s and 0s will be stored in this area, up to 100 places
	int bi[] = new int[100];

	public String getBinary(int num) {
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
	
	public String getHexToBinary(String input) {
		
		int x=0;
		String num="";
		String answer="";

		for(int i=0; i<input.length();i++){
			switch(input.charAt(i)) {
				case '1':
				answer+= "0001";
				break;
				case '2':
				answer += "0101";
				break;
				// case '3':
				// num = 3;
				// break;
				// case '4':
				// num = 4;
				// break;
				// case '5':
				// num = 5;
				// break;
				// case '6':
				// num = 6;
				// break;
				// case '7':
				// num = 7;
				// break;
				// case '8':
				// num = 8;
				// break;
				// case '9':
				// num = 9;
				// break;
				// case 'A':
				// num=10;
				// break;
				// case 'B':
				// num=11;
				// break;
				// case 'C':
				// num=12;
				// break;
				// case 'D':
				// num=13;
				// break;
				// case 'E':
				// num=14;
				// break;
				// case 'F':
				// num=15;
				// break;
			}
			// String answer ="";
			
			// System.out.println(num);
			// while(Integer.valueOf(num)!=0) {				
			// 	//if remainder, bi[i]=1, if no remainder, bi[i] = 0
			// 	answer += String.valueOf(num);
			// 	//			System.out.println(bi[i]);
			// 	//cut num in half
			// 	// num = num/2;
			// 	//iterate to the next position of the array
			// 	x++;
			// }
		}
			
		
// 		for(int j=x-1; j>=0; j--) {
// //			System.out.print(bi[j]);
// 			answer += bi[j];
// 		}		
		System.out.println(answer);
		return answer;
		
	}
}
