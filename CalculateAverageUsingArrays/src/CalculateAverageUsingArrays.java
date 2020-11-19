public class CalculateAverageUsingArrays {
	
	public static void main(String[] args) {
		
		double[] numbers=new double[] {29.0,24.55,22.6,23.44};
		double total=0;
		for(double i:numbers) {
			total+=i;
		}
		
		System.out.println("Average of Array: " +(total/numbers.length));
		
		
		
	}
	
	

}
