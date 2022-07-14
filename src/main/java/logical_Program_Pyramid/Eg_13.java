package logical_Program_Pyramid;

public class Eg_13 {

	public static void main(String[] args) {

//		 ****
//		  ***
//		   **
//		    *
//		   **
//		  ***
//		 ****
		int space=0;
		int star=4;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}	
			for(int j= 1;j<=star;j++)
			{
				System.out.print("*");
			}	
			System.out.println();
			if(i<4)
			{
				star--;
				space++;
			}
			else
			{
				star++;
				space--;
			}	
			
		}	
		 
		 
	}

}
