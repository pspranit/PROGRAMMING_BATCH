 class Program7
{
	public static void main(String[] args) 
	{
		int lines=5;
		int star=5;
		
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(i==0||j==0||i+j==4)
				{
				System.out.print("*");
				}
				else
				 {
					System.out.print(" ");
				 }
			}
				System.out.println();
		}
	}
		
		
}


