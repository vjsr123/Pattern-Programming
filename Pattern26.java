import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = scan.nextInt();
		int count =2;
		int res =1;
		for(int i=0;i<a;i++)
		{
			for (int j=0;j<a;j++)
			{
				if(i<=a/2)
				{
					if(count==1 || count<=9)
					{
						System.out.print("0");
					}
					if(count==10 || count<=a*a)
					{
				        System.out.print(count+" ");
					}
				count+=2;
				}
			    if(i>=a/2)
				{
			    	if(res ==1 || res<=9)
			    	{
			    		System.out.print("0");
			    	}
			    	if(res==10 || res<=a*a)
			    	{
			    		System.out.print(res+" ");
			    	}
					res+=2;
				}
				
			}
			System.out.println();
		
		}
		

	}

}
