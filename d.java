public class d {
    public static void main(String[] args) {
        String a = "Hello world";
        int[] b = count(a);

        System.out.println(b[0]);
        System.out.println(b[1]);

    }
    public static int[] count(String str ){
        str = str.toLowerCase();
        int vovel = 0;
        int normal = 0;

        for(int i = 0 ; i< str.length() ; i++){
            char h = str.charAt(i);

            if(h == 'a' || h == 'l' || h == 'c'){
                vovel++;
            }else if(h >= 'a' && h <='z'){
                normal++;
            }

        }
        return new int[]{vovel , normal};
    }
}
