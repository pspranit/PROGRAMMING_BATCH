class Second
{
	public static void main(String[] args) {
		
		int arr[]={111,222,333,444,111,222};

		//SIMPLE FOR LOOP
		for(int a=0;a<arr.length;a++){

			System.out.println(arr[a]);
		}

		//ENHANCED FOR LOOP
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}