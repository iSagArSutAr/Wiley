package Assignment;

public class Fibonacci {
	
	int start,end;
	
	public Fibonacci(int start,int end) {
		this.start=start;
		this.end=end;
	}
	
	public void fibo() {
		int f1=0,f2=1,f3=f1+f2;
		while (f1 <= end) {
            if (f1 >= start)
                System.out.println(f1);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
	}
	
	public static void main(String[] a) {
		Fibonacci fibonacci=new Fibonacci(15,65);
		fibonacci.fibo();
	}
}
