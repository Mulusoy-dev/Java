import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int reversed=0;
		
		
		while (number!=0) {
			int digit=number%10;
			reversed=reversed*10 + digit;
			number/=10;
			
		}
		
		System.out.println(reversed);
		
		
		
		
	}
	
	
	

}
