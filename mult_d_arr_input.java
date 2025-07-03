import java.util.Scanner;

public class mult_d_arr_input {
    

    public static void main(String args []){

        //int[][] arr = new int[3][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the multidimensional array: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[][] arr = new int[size1][size2];

        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter array elements :");
            for (int j = 0 ; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.println("Array " +i+ " :");
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
