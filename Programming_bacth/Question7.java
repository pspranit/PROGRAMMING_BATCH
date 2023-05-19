package Programming_bacth;

public class Question7 {

    public static void main(String[] args) {
        int line = 5;
        int star = 5;

        char ch1='A';
        //char ch2='B';

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++)
            {
                    System.out.print(ch1);
            }


            if(i>1){
                ch1--;
            }
            else {
            ch1++;
            }
            System.out.println();
        }
    }
}
