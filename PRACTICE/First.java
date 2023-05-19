class First{
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,20,20,10,30,11};
		int value=0;
		int max=0;
		
		for(int a:arr)
		{
			int count=0;
			for(int b:arr)
			{
				if(a==b)
				{
				count++;
				}
			}
			
			if(count>max)
			{
				max=count;
				value=a;
			}
		}
		System.out.println(max+"\t"+value);
		
	}
}