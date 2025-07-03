public class str_rev_demo {
    

    public static void main(String args[]){

        String og = "original";
        String rev = "";

        for (int i = og.length() - 1; i>=0;i--){
            rev += og.charAt(i);
        }

        System.out.println(rev);
    }
}
