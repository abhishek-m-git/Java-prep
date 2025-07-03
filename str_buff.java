public class str_buff {
    


    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("New");

        System.out.println(sb);
        // System.out.println(sb.capacity());
        System.out.println(sb.hashCode());

        sb.append("reddy");
        System.out.println(sb);
        System.out.println(sb.hashCode());


        sb.insert(4, " ");
        System.out.println(sb);
    }
}
