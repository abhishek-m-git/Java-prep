class multd_array{


     public static void main(String[] args) {

        int[][] arr = new int[3][4];
        // int arr[][] = new int[3][4];

        // arr[0][0] = 1;
        // arr[0][1] = 002;
        // arr[0][2] = 003;
        // arr[0][3] = 004;
        
        // arr[1][0] = 11;
        // arr[1][1] = 22;
        // arr[1][2] = 33;
        // arr[1][3] = 44;
        
        // arr[2][0] = 111;
        // arr[2][1] = 222;
        // arr[2][2] = 333;
        // arr[2][3] = 444;

      for (int i = 0 ; i<=2; i++){
            for (int j = 0; j<=3; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i = 0 ; i<=2; i++){
            for (int j = 0; j<=3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}