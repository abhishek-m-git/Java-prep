public class for_loop {
    
    public static void main(String args[]){

        for(int i = 1; i <= 10; i++){

            System.out.println(i);

        }


        for (int x = 1; x<=5; x++){
            System.out.println("Day " + x);
            for(int k = 1; k<=9; k++){
                System.out.println(" " + (k+8) + " - " + (k+9));
            }
        }
    }
}
 