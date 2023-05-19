package angularMind;

public class Question5 {
    public static void main(String[] args) {

        int line=5;
        int star=5;
        int no1=1;
        int no2=0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0))
                {
                    System.out.print(no1);
                }
               else
                {
                    System.out.print(no2);
                }
            }
            System.out.println();
        }
    }
}
