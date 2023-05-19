package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Program2 {
    public static void main(String[] args) {

        String str="CORE JAVA PROGRAMMING";
        Set<Character> hs1=new HashSet<>();
        for (int i = 0; i < str.length()-1; i++) {
            hs1.add(str.charAt(i));
        }
        for(Character a:hs1)
        {
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                if(a==str.charAt(i))
                {
                    count++;
                }
            }
            System.out.println(a+"=OCCURENCE :"+count);
        }
    }
}
