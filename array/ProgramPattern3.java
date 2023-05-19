package array;

public class ProgramPattern3 {
    public static void main(String[] args) {

        char ch[]={'S','T','A','R'};
        int line=4;
        int star=4;


        for (int i = 0; i < line; i++) {
            int ch2=i;
            for (int j = 0; j < star; j++) {
                System.out.print(ch[ch2]+" ");
                ch2++;

                if(ch2>3)
                {
                    ch2=0;
                }
            }
            System.out.println();

        }
    }
}
