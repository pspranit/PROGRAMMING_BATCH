package angularMind;

public class Question11 {
    public static void main(String[] args) {

        int line=5;
        int star=5;

        int no=1;
        int no2=0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                if(i==j)
                {
                    System.out.print(no++);
                }
                else {
                    System.out.print(no2);
                }
            }
            System.out.println();
        }
    }
}
