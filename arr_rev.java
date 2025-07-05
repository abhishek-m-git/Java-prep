public class arr_rev{

    public static void main(String args[]){

        int[] arr = new int[5];
        int[] rev = new int[arr.length];
        int p= 0;

        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;

        for (int i = arr.length-1;i>=0;i--){
            rev[p] = arr[i];
            p++;
        }

        for (int i : rev) {
            System.out.println(i);
        }
        
    }
}