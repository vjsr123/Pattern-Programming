import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		int a = scan.nextInt();
		System.out.println("Enter the breadth");
		int b = scan.nextInt();
		pattern(a,b);
		// TODO Auto-generated method stub

	}
	public static void pattern(int x,int y)
	{
		for(int i=1 ;i<=y;i++)
		{
			System.out.println();
			for(int j=1;j<=x;j++)
			{
				System.out.print("*");
			}
		}
	}

}
