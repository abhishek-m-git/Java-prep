public class ternery {
    
    public static void main(String args[]){

        int i = 3;
        String result = "0";

        // if(i%2==0){
        //     result = "Postive";
        // }
        // else{
        //     result = "Negative";
        // }

        result = i%2==0 ? "Pos" : "Neg";

        System.out.println(result);

    }
}
