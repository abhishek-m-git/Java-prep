class str_rev_demo{

    public static void main(String srgs[]){

        String og = "Abhishek";
        String rev = "";
        String str = "";

        for (int i = og.length()-1;i>=0;i--){
            rev += og.charAt(i); 
        }

        System.out.println(rev);
        System.out.println(str);
    }
}