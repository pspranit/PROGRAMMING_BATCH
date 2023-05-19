package pattern.string;

public class Brackets {
    public static void main(String[] args) {

        String str = "(){}[]<>";

        char arr[] = str.toCharArray();
        int n1 = arr.length;
        boolean status = true;
        if (n1 % 2 == 0) {
            for (int i = 1; i < arr.length; i += 2) {
                int sum = arr[i] - arr[i - 1];

                if (!(sum < 3 && sum > 0)) {
                    status = false;
                }
            }

            if (status) {
                System.out.println("VALID BRACKETS");
            }
        }
        else {
            System.out.println("BRACKETS ARE NOT VALID");
        }
    }
}


