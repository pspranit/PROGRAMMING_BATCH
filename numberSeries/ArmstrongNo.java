package pattern.numberSeries;

public class ArmstrongNo {
    public static void main(String[] args) {

//        int a=153;
//        int arm=a;
//        int sum=0;
//        while(a!=0)
//        {
//            int r=a%10;
//            sum+=(r*r*r);
//            a=a/10;
//        }
//        if(sum==arm)
//        {
//            System.out.println("ARMSTRONG NUMBER");
//        }
//        else {
//            System.out.println("NOT A ARMSTRONG NUMBER");
//        }
//===============================================================================================
        // ARMSTRONG NUMBER FOR 4 DIGIT
//        int a=1234;
//        int arm=a;
//        int temp=a;
//        int count=0;
//        int sum=0;
//
//        while(a!=0)
//        {
//            a=a/10;
//            count++;
//        }
//        if(temp!=0)
//        {
//            int r=temp%10;
//            sum+=(Math.pow(r,count));
//            temp=temp/10;
//        }
//        if(sum==arm)
//        {
//            System.out.println("ARMSTRONG NUMBER");
//        }
//        else {
//            System.out.println("NOT A ARMSTRONG NUMBER");
//        }
        //==================================================================================================
        //ARMSTRONG NUMBER BETWEEN 10 TO 100000
        for (int i = 10; i <= 100000; i++) {
            int a = i;
            int temp = a;
            int count = 0;
            int sum = 0;

            while (a != 0) {
                a = a / 10;
                count++;
            }
            while (temp != 0) {
                int r = temp % 10;
                sum=(int)(sum+Math.pow(r, count));
                temp = temp / 10;
            }
            if (sum == i)
            {
                System.out.println(i);
            }
        }
    }
}

