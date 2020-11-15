import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int N=scanner.nextInt();
		int[] number=new int[N];
		
		number[0]=0;
		number[1]=1;
		
		
		for(int i=2;i<N;i++) {
			number[i]=number[i-2]+number[i-1];
			
			
		}
		for(int i=0;i<N;i++) {
			System.out.println("Array: "+ number[i]);
		}
		
		
		
		
		
		
	}
	
	
	

}
