import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter a values :");
        
        int input = a.nextInt();

        int[] b = new int[input];
        System.out.println("enter next values :");
        for(int i = 0; i < input; i++){
            b[i] = a.nextInt();
        }


        int sum = 0;

        for(int i = 0; i<b.length; i++){
            sum+= b[i];

        }
        System.out.println(sum);


        
    }
}
