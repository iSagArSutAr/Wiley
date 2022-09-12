
public class FlowControls {
	
	@SuppressWarnings("unused")
	public void flowC(int a) {
		
		if(true) {
			System.out.println("if statement\n");
		}else {
			System.out.println("else statement");
		}
		
		if(false) {
			System.out.println("if statement");
		}else {
			System.out.println("else statement\n");
		}
		System.out.println("Printing 0 to 10");
		System.out.println("for loop");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		System.out.println("\nWhile loop");
		int c=5;
		while(c<10) {
			System.out.println(c);
			c++;
		}
		
		System.out.println("\ndo while loop");
		do {
			System.out.println(c);
		}while(c<10);
		System.out.println();
		for(int i=0;i<10;i++) {
			
			if(i%2==0) {
				System.out.println("Continue");
				continue;
			}
			if(i>5) {
				System.out.println("Break");
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		switch(a) {
		case 1: System.out.println("Switch statement 1");break;
		case 2: System.out.println("Switch statement 2");break;
		case 3: System.out.println("Switch statement 3");break;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		FlowControls f = new FlowControls();
		f.flowC(2);
	}
}
