import java.util.*;
public class e {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("enter a word :");
        String input = i.nextLine();

        int[] n = count(input);

        System.out.println("the number of Vovels : "+ n[0]);
        System.out.println("the number of values :" + n[1]);
    }
    public static int[] count(String str){
        str = str.toLowerCase();

        int vovel = 0;
        int value = 0;

        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);

            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' ||  a == 'u' ){
                vovel++;
            }else if (a >= 'a' && a <= 'z'){
                value++;
           }
        }

        return new int[] {vovel,value};
    }
}
