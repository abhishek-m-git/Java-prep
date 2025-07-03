class demo{

    static int i =10; //Static Variable
    int p =10;

    demo(){
        System.out.println("Inside demo after long time");
    }
 
    static{     //static block
        System.out.println("Inside static block");
    }

    static void show(){  //Static method
        System.out.println("Inside static method");

        // System.out.println(p);   //non staic variables cannot be used in static methods
        System.out.println(i);
    }

    void disp(){
        System.out.println(p);
        System.out.println(i);
    }



}

public class static_demo {

        public static void main(String args[]){

            // System.out.println(demo.i);
            // demo.show();


            // demo ds = new demo();
            demo.show();
        
        }
}
