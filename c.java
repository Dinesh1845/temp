// import java.util.*;

// public class c {
//     public static void main(String[] args) {
//         Scanner n = new Scanner(System.in);
//         String input = n.nextLine();
//         StringBuilder a = new StringBuilder(input);
//         a.reverse();
//         System.out.println(a);
//     }
// }

import java.util.*;

public class c {
    public static void main(String[] args) {
        String real = "Hello";
        String back = revesedString(real);

        System.out.println(back);

    }
    public static String revesedString(String str){
       String  back = "";
       for(int i=  str.length() -1 ; i>=0; i-- ){
            back += str.charAt(i);

       }
       return back;
    }
}