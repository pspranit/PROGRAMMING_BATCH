package array;

//SELECTION SORT
public class MinIndex {
    public static void main(String[] args) {
        int arr[]={10,5,2,4,1};

        for (int i = 0; i < arr.length; i++)
        {
            int minIndex=i;

            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

            }

            for(int a:arr)
            {
                System.out.print(a+" ");
            }
        }
    }

