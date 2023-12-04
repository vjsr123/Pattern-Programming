
public class Pattern22 {

	public static void main(String[] args) {
		int count=25;
		for(int i=1;i<=5;i++)
		{ 
			for(int j=1;j<=5;j++)
			{
				if(count==1 || count<=9)
				{
					System.out.print("0");
				}
				if(count==10 || count<=25)
				{
					System.out.print(count+" ");
				}
				count--;
			
			
			}
			
				
			
			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
