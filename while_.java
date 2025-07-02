public class while_ {

    public static void main(String args[]) {

        // for (int i = 1;i<=10;i++){
        // System.out.println(i +" "+ "First Loop In Java");
        // }

        int x = 1;
        int y = 20;

        while (x <= y) {
            System.out.println("This is the value of x right now :" + " " + x);

            int j = 1;
            while (j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }
            x++;
        }

    }
}
