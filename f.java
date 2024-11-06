public class f {
    public static void main(String[] args) {
        int[] arr = {12, 1, 13};
        int b = arr[0];

        for(int i = 0; i <arr.length; i++){
            if(b < arr[i]){
                b = arr[i];
            }
        }
        System.out.println(b);
    }
}
