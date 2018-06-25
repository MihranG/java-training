import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int length =  scanner.nextInt() ; 
		int[] myArr = new int[length]; 
		for(int i = 0; i<length; i++){
			myArr[i] = scanner.nextInt();
		};
		int result = maxim(length, myArr);
		System.out.println(result);
		
	}
	
	public static int maxim (int length, int[] myArray){
		int max = myArray[0];
		for(int i = 1; i<length; i++ ){
			int diff = max - myArray[i] ; 
			int sign = diff>>>31 ;
			max = max - diff*sign;
		}
		return max;
	}

}
