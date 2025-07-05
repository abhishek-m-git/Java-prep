public class exception_2 {

    public static void main(String args[]){


        int i = 20;
        int j = 0;

        try {

            // j = 18/0;
            if (j == 0){
                // System.out.println("From here");
                throw new ArithmeticException("j is 0");
            }
        }

        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("Inside arithmatic exception " + e);
        }

        catch(Exception e){
            System.out.println("from main exception " + e);
        }

        System.out.println(j);
    }
}
