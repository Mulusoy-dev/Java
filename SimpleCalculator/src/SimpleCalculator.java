import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		scanner.useLocale(Locale.US);
		System.out.println("Enter two numbers: ");
		
		double number1=scanner.nextDouble();
		double number2=scanner.nextDouble();
		
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		double result=0;
		
		switch (operator) {
		case '+':
			result=number1+number2;
			break;
		case '-':
			result=number1-number2;
			break;
		case '*':
			result=number1*number2;
			break;
		case '/':
			if(number2==0) {
				System.out.println("Invalid");
				return;
			}
			else {
				result=number1/number2;
			}
			break;
		default:
			System.out.println("Try Again");
			break;
		}
		
		
		
		System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
		
		
		
	}
	
	
	

}
