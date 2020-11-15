import java.util.Scanner;

public class DisplayPrimeNumbersBetweenTwoIntervals {
	
	public static void main(String[] args) {
		int low=20;
		int high=50;
		
		while(low<high) {
			boolean flag=false;
			
			for(int i=2;i<low/2;i++) {
				
				if(low%i==0) {
					flag=true;
					break;
				}	
			}
			
			if(!flag && low!=0 && low!=1) {
				System.out.println(low + " ");
			}
			low++;
		}

	}		
}	
		
		
		
		
	
	
	
	

