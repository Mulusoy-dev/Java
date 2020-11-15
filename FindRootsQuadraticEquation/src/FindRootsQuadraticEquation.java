import java.util.Scanner;

public class FindRootsQuadraticEquation {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		
		double delta=b*b-4*a*c;
		double root1,root2;
		
		
		if (delta>0) {
			System.out.println("roots are real and different");
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("Roots: " + root1 + " and " + root2);	
		}
		else if(delta==0) {
			System.out.println("the roots are real and equal");
			root1 = root2 = -b / (2 * a);
			System.out.println("Roots: " + root1);
			
		}
		else if(delta<0){
			System.out.println("the roots are complex and different");
		}
		
		
		
		
		
		
		root1=(-b+Math.sqrt(delta))/(2*a);
		root2=(-b+Math.sqrt(delta))/(2*a);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
