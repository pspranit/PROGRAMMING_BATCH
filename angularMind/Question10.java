package angularMind;

public class Question10 {
    public static void main(String[] args) {

        int line =5;
        int star=5;
        int no3=0;
        int no1=4;

        for (int i = 0; i < line; i++) {
            int no2=no1;
            for (int j = 0; j < star; j++) {
                if(j>no1)
                {
                    System.out.print(no3);
                }
                else
                {
                    System.out.print(no2--);
                }
            }
            System.out.println();
            no1--;
        }
    }
}
