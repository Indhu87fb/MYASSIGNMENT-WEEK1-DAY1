package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		System.out.println("Fibonacci Series");
		
		for (int i = 0; i < 8; i++) {
			System.out.print(n1+",");
			n3=n1+n2;
			n1=n2;
			n2=n3;
					
			
		}
	}

}
