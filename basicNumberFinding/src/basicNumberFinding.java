public class basicNumberFinding {

	public static void main(String[] args) {
		
		int[] numbers=new int[]{1,4,6,7,89,9,0};
		int finder=1;
		int index=0;
		boolean exis=false;
		for(int i=0;i<numbers.length;i++) {

			if(finder==numbers[i]) {
				index=i;
				exis=true;
				break;
			}
			
		}
		
		if(exis) {
			System.out.println("Number Found and " + "Index: " + index);
		
		}
		else {
			System.out.println("Number Not Found!");
		}
		
		
	}
	
	
	
	
	
}
