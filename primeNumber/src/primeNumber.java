import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		int say=num.nextInt();
		int i;
		int sayac=0;
		
		if(say==1) {
			System.out.println("Not Prime Number");
			return;
		}
		
		
		if(say<1) {
			System.out.println("Invalid!");
			return;
		}
		
		
		for(i=2;i<say;i++) {
			
			if( say%i==0 ) {
				sayac++;
			}
			
		}
		
		if(sayac!=0) {
			System.out.println("Not Prime Number");
				
		}
		else if (sayac==0){
			System.out.println("Prime Number!");
			
		}
		else {
			System.out.println("Invalid");
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
