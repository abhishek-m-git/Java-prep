public class exception_handle {

    public static void main(String args[]){

        int i = 0;
        int j = 0;

        int[] arr = new int[5];

        try{
            // j = 18/0;
            // System.out.println(arr[5]);
            System.out.println(10/0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("be in your limits : " + e);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot didvide by zero");
        }

        catch(Exception e){
            System.out.println("Ho gaya kaam : " + e);
        }


        // System.out.println(j);
    }
}
