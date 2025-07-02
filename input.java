import java.util.Scanner;

class input{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = sc.nextLine();


        System.out.println("Enter age : ");
        String age = sc.nextLine();

        System.out.println("Your Name is : `¡" + name + " And Your age is : " + age );
    }
}