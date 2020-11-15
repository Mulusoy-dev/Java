import java.util.Scanner;

public class CheckNumberPalindromeOrNot {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int total=0,digit,originalNumber,reversed=0;
		
		originalNumber=number;
		
		while(originalNumber!=0) {
			
			digit=originalNumber%10;
			reversed=reversed*10+digit;
			total+=Math.pow(digit, 3);
			originalNumber/=10;
			
		}
		
		if(reversed==number) {
			System.out.println(number + " is a palindrome.");
		}
		else {
			System.out.println(number + " is not a palindrome.");
		}
	}
	
	

}
