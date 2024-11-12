package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int num=0;
		boolean flag=false;
		
		if (num==0 || num==1) {
			flag=true;
			
			
		}
		for (int i = 0; i < num/2; i++) {
			
			if (num%2==0) {
				flag=true;
			}
			
		}
		if(!flag)
		{
			System.out.println(num +"is a prime no");
		}
		else {
			System.out.println(num +"is not a prime no");
		}
	}
	

}
