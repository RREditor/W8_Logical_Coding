package logical_Program_Pyramid;

public class Eg_18 {

	public static void main(String[] args) {

//		5
//		54
//		543
//		5432
//		54321
		
		
		//int line=1;
		for(int i=1;i<=5;i++)
		{
			int prt=5;
			for(int j=1;j<=i;j++)
			{   
				System.out.print(prt);
				prt--;
			}	
			System.out.println();
			i++;
		}	

	}	
}


