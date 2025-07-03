class demo{

    int i;
    int j;

    demo(){
        System.out.println("1st Constructor has been called");
    }

    demo(int i,int j){
        this.i = i;
        this.j = j;
        System.out.println("2nd Constructor has been called");
    }  

    void show(){
        System.out.println(i);
        System.out.println(j);
    }
}



public class constructor {
    
    public static void main(String args[]){

        demo ds = new demo();

        ds.show();



    }
}
