import java.util.Scanner;

public class perfectNumbers {

	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);
		int number1=number.nextInt();
		int total=0;
		
		for(int i=1;i<number1;i++) {
			
			if(number1%i==0) {
				total+=i;
			}
		}
		
		if(total==number1) {
			System.out.println("The value " + number1 + " is PERFECT");
		}
		else {
			System.out.println("The value " + number1 + " is NOT PERFECT");
		}
		
		
	}
	
	
	
	
}
