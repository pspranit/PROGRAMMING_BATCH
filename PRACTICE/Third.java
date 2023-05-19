class Third
{
	public static void main(String[] args) {
		
		int arr[]={10,30,20,60,40,5};
        
		for(int i=0;i<arr.length-1;i++)
		{
           for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		
		}

		for ( int k:arr ) {
			System.out.println(k);
			
		}

		insertSorting(arr);

	}

	public static void insertSorting(int arr[])
	{
		int max1=arr[0];
		int max2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			
				if(arr[i]>max1)
				{

					max2=max1;
					max1=arr[i];
				}
				else if(arr[i]>max2)
				{
					arr[i]=max2;
				}
			


		}
		for(int c:arr)
		{
			System.out.print(c+",");
		}
        System.out.println("\n"+max2 +"\t"+max1);
         System.out.println(arr[0]);
	}
}