
public class Pattern13 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=4;i>0;i--)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		// TODO Auto-generated method stub

	}

}
