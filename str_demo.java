public class str_demo {
    

    public static void main(String args[]){

        String s1 = "navi";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        


        s1 = "navi";

        System.out.println(s1);
        System.out.println(s1.hashCode());

        s1 = s1+" ";
        System.out.println(s1);
        System.out.println(s1.hashCode());
    }
}
