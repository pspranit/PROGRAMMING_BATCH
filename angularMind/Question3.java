package angularMind;

public class Question3 {
    public static void main(String[] args) {

        int line=5;
//        int star=2;
        int no1=1;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i+2; j++) {
                if(i%2==0)
                {
                    System.out.print(no1);
                }
                else {
                    System.out.print("*");
                }
            }
            if(i%2==0)
            {
                no1++;
            }
            System.out.println();
//            star++;

        }
    }
}
