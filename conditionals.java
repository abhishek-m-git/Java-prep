public class conditionals {
    
    public static void main (String args[]){
        
        int x = 100 ;
        int y = 20;
        int z = 3;

        // if (x<=10){

        //     System.out.println("value of x is less than 10");
        // }
        // else{
        //     System.out.println("value of x is grater than 10");
        // }

        if (x>y && x>z){
            System.out.println("X is the KING!!!");
        }
        else if(y>z){
            System.out.println("Y is the GOAT!!!");
        }
        else {
            System.out.println("Z is the RIZZLER!!!");
        }
    }
}
