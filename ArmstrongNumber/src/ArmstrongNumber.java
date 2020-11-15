import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int originalNumber=scanner.nextInt();
		int total=0,digit,number;
		number=originalNumber;
		
		
		while(number!=0) {
			
			digit=number%10;
			total+=Math.pow(digit, 3);
			number/=10;
				
		}
		
		if(total==originalNumber) {
			System.out.println(originalNumber+ " is an Armstrong number");
		}
		else {
			System.out.println(originalNumber+ " is not an Armstrong number");
		}
		
		
		
	}
	
	
	
	

}
