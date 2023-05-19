package angularMind;

public class Question13 {
    public static void main(String[] args) {

        int line=5;
        int star=1;

        for (int i = 0; i < line; i++) {
            int no2=line;
            for (int j = 0; j < star; j++) {
                System.out.print(no2--);
            }
            System.out.println();
            star++;
        }
    }
}
