package QuestionAngularMind;

public class Program8 {
    public static void main(String[] args) {

        int line=4;
        int star=1;
        int no1=1;
        int space=line-1;
        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(no1+++" ");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
