class demo{

    demo(){
        System.out.println("obj created");
    }
}


public class annon_obj {

        public static void main(String args[]){

        System.out.println( new demo().hashCode() );
        System.out.println( new demo().hashCode() );
        System.out.println( new demo().hashCode() );
        System.out.println( new demo().hashCode() );

        }
}
