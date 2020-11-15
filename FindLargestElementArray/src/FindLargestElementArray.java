public class FindLargestElementArray {
	
	public static void main(String[] args) {
		
		double[] array= { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
		double largest=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(largest<array[i]) {
				largest=array[i];
			}
		}
		System.out.println("Largest element= "+largest);	
			
	}
		
		
		
}
	
	
	


