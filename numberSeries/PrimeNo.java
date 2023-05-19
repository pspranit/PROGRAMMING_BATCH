package numberSeries;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER NUMBER");
//        int no = sc.nextInt();
        int no=3;
        int count = 0;

        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                count++;
            }
        }

            if(count == 2)
            {
                System.out.println("PRIME NUMBER");
            }
            else
            {
                System.out.println("IS NOT PRIME NUMBER");
            }
        }
    }
