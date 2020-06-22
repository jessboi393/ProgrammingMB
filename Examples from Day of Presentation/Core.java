
public class Core {
	public static void main(String[] args) {
		
		int counter  = 20;
		
		
		System.out.println("While Loop");
		
		while(counter < 10) {
			System.out.println("The value of counter " + counter);
			counter++;
			
			
			
			//counter++;
			//counter = counter + 1;
			
		}
		
		System.out.println("For Loop");
		for(int i = 0; i<100; i++) {
			System.out.println(i);
		}
		
		
		int doCounter = 0;
		
		System.out.println("Do-While Loop");
		do {
			
			System.out.println(doCounter);
			doCounter++;
			
		}while(doCounter < 10);
		
		
		
	}
}
