public class type_conversion_casting {

    public static void main(String args[]){


        byte b = 1;
        int a = 1233;

        b= (byte)a;

        System.out.println(b);


        float f = 124.5555f;
        int c = (int)f;

        System.out.println(c);


        byte x = 10;
        byte y = 20;

        int z = x*y;   //type promotion

        System.out.println(z);


    }
    
}
