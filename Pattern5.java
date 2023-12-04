import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the height of rectangle");
		int a= scan.nextInt();
		pattern(a);
		
	}
	public static void pattern(int x)
	//Using For loop:
	
	/*{
	   for(int i=1;i<=x;i++)
	   {
		   System.out.println();
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("*");
		   }
	   }
	}*/
	
	// Using While Loop:
	
	/*{
	int i=1;
	while(i<=x)
	{
		int j=1;
		while(j<=i)
		{
			System.out.print("*");
			j++;
		}
		System.out.println("");
		i++;
	}
    }
    */
	
	// Using dowhile Loop:
	{
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("*");
				j++;
			}
			while(j<=i);
	    System.out.println("");
		i++;
		}
		while(i<=x);
		
	}
	
	
}
