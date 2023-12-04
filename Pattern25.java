
public class Pattern25 {

	public static void main(String[] args) {
		int count = 1;
		for(int i=1 ;i<=4;i++)
		{
			for (int j=1 ;j<=4;j++)
			{
				if(count==1 || count<=9)
				{
					System.out.print("0");
				}
				if(count==10 || count<=50)
				{
				System.out.print(count +" ");
				}
				count+=2;
			}
			System.out.println(" ");
		}
		// TODO Auto-generated method stub

	}

}
