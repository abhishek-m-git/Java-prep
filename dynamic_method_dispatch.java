class A{
    public void show(){
        System.out.println("Inside show of A");
    }
}

class B  extends A{
    public void show(){
        System.out.println("Inside show of B");
    }
}




public class dynamic_method_dispatch {

    public static void main(String args[]){

    A cls = new B();
    cls.show();

    cls = new A();
    cls.show();



    }



}
