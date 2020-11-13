public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int number1=15;
		int number2=20;
		int temporary;
		
		System.out.println("---Before Swap---");
		System.out.println("First Number= "+ number1);
		System.out.println("Second Number= "+ number2);
		
		temporary=number2;
		number2=number1;
		number1=temporary;
		
		
		
		System.out.println("---After Swap---");
		System.out.println("First Number= "+ number1);
		System.out.println("Second Number= "+ number2);
		
	}
	
	
	
}
