import java.util.Scanner;

class Students{

    int id;
    String name;
    int marks;
}

public class arrayof_obj {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Students");
        int studs = sc.nextInt();

        Students arr[] = new Students[studs];

        for (int i = 0;i<studs;i++){
            
            arr[i] = new Students();


            System.out.println("Enter details for student " + ( i+1) + ":"); 
            
            System.out.println("Enter ID :"); 
            arr[i].id = sc.nextInt();
            // System.out.println("Enter Name :"); 
            // arr[i].name = sc.next();
            System.out.println("Enter Marks :"); 
            arr[i].marks = sc.nextInt();
            System.out.println();
        }
        

        // for (int i =0; i<arr.length;i++){

        //     System.out.println("Details of the Students :");
        //     System.out.println("ID of the Student    : " + arr[i].id);
        //     System.out.println("Name of the Student  : " + arr[i].name);
        //     System.out.println("Marks of the Student : " + arr[i].marks);
        //     System.out.println();
        // }

        for(Students n:arr){

            System.out.println(n.id + " " + n.name + " " + n.marks + " ");
            // System.out.println(n.id);
            // System.out.println(n.name);
            // System.out.println(n.marks);
            System.out.println();

        }

    }
    
}
