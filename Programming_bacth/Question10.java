package Programming_bacth;

public class Question10 {
    public static void main(String[] args) {

        int line=6;
        int star=1;

        int no1=1;
        int space=line-1;

        for(int i = 0; i < line; ++i) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j < star; ++j) {
                if (no1 >= 6) {
                    System.out.print(no1+++" ");
                    no1 = 1;
                } else {
                    System.out.print(no1+++" ");
                }
            }
            space--;
            star++;
            System.out.println();
            }
        }
}
