package angularMind;

public class Question15 {
    public static void main(String[] args) {

        int arr[]={1,2,2,2,4,2,6};

        int maxCount=0;
        int e1=0;

        for (int i = 0; i < arr.length; i++) {
            int count=0;

            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount=count;
                e1=arr[i];
            }
        }
        System.out.println(maxCount);
    }
}
