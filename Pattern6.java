import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the height of rectangle");
		int a= scan.nextInt();
		
		pattern(a);
		
		
	}
	public static void pattern(int x)
	
	  /* for(int i= x;i>0;i--)
	   {
		   System.out.println("");
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("*");
		   }
	   }
	   */
	
	//Using While Loop
	
	/*{
		int i=x;
		while(i>0)
		{
			{
				int j=1;
				while(j<=i)
				{
					System.out.print("*");
					j++;
				}
				i--;
				System.out.println("");
				
			}
			
			
		}
	}*/
	
	//Using DoWhile Loop:
	
	{
		int i=x;
		do
		{
			{
				int j=1;
				do
				{
					System.out.print("*");
					j++;
				}
				while(j<=i);
		i--;
		System.out.println("");
				
			}
			
			
		}
		while(i>0);
	}
		
	

}
