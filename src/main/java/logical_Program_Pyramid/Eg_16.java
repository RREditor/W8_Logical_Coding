package logical_Program_Pyramid;

public class Eg_16 {

	public static void main(String[] args) {

//		*      *
//		**    **
//		***  ***
//		********
//		***  ***
//		**    **
//		*      *	

		int star=1;
		int space=3;
	
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}	
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}	
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}	
			System.out.println();
			if(i<4)
			{
				star++;
				space--;
			}	
			else
			{
				star--;
				space++;
			}	
		}	
		
		
	}

}
