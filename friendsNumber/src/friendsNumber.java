import java.util.Scanner;

//Friends Number 220-284      220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
//                            284: 1 + 2 + 4 + 71 + 142 = 220
public class friendsNumber {
	
	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		int number1=num.nextInt();
		int number2=num.nextInt();
		int total1=0;
		int total2=0;
		
		for(int i=1;i<number1;i++) {
			
			if(number1%i==0) {
				total1+=i;
			}	
		}
		for(int j=1;j<number2;j++) {
			
			if(number2%j==0) {
				total2+=j;
			}	
		}
		
		if(total1==number2 && total2==number1) {
			System.out.println("The values "  + number1 + " " + number2 + " is FRIENDS NUMBER");
		}
		else {
			System.out.println("The values " + number1 + " " + number2 + " is NOT FRIENDS NUMBER");
		}
		
		
	}
	
	
	
	
	
}
