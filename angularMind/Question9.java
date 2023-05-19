package angularMind;

public class Question9 {
    public static void main(String[] args) {

        int line = 5;
//        int star = 2;
        int no=1;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i+2; j++) {
                if(i%2==0)
                {
                    System.out.print(no+" ");
                }
                else
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
            no++;
//            star++;
        }


    }
}

