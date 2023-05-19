package string;

public class FirstCap {
    public static void main(String[] args) {

        String str="THIS IS PROGRAMMING BATCH !!";
        String[]arr=str.split(" ",0);

        for (String a:arr)
        {
            String s1=a.replace(a.charAt(0),a.toLowerCase().charAt(0));

            String s2=a.substring(0,1).toLowerCase()+a.substring(1);

            System.out.print(s1+" ");
            System.out.print(s2+" ");
        }

    }
}
