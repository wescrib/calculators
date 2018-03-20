package binaryCalc;

public class Maths {

	//1s and 0s will be stored in this area, up to 100 places
	int bi[] = new int[100];

	public long getBinary(int num) {
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
		
		String answer ="";
		
		for(int j=i-1; j>=0; j--) {
//			System.out.print(bi[j]);
			answer += bi[j];
		}		
		System.out.println(answer);
		return Long.valueOf(answer);
	}
	
	public char[] getHexToBinary(String input) {
		char[] charArr = input.toCharArray();
//		System.out.println(charArr);
		int i=0;
		while(i>charArr.length-1) {
			switch(charArr[i]) {
			case 'A':
				charArr[i]=10;
			case 'B':
				charArr[i]=11;
			case 'C':
				charArr[i]=12;
			case 'D':
				charArr[i]=13;
			case 'E':
				charArr[i]=14;
			case 'F':
				charArr[i]=15;
			}
			
			i++;
		}
		System.out.println(charArr);
		return charArr;
		
	}
}
