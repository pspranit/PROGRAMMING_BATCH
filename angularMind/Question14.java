package angularMind;

public class Question14 {
    public static void main(String[] args) {

        int line=5;
        int star=5;

        int no1=5;

        for (int i = 0; i < line; i++) {
            int no2 = no1;

            for (int j = 0; j < star; j++) {

                if(i>j)
                {

                    System.out.print(no2++);
                }
                else
                {
                    System.out.print(no2=5);
                }
            }
            System.out.println();
            no1--;
        }
    }
}
