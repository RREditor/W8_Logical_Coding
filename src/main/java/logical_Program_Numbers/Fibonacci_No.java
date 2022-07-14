package logical_Program_Numbers;

public class Fibonacci_No {

	public static void main(String[] args) {

		//Fibonacci No 0 to 50.
		System.out.println("Fibonacci No.");
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		for(int i=2;i<=20;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}	
		
	}

}
