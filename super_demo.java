class demo1{

    demo1(){
        System.out.println("inside cons of demo1");
    }
    demo1(int i){
        System.out.println("inside cons of demo1 but requires int");
    }
}

class demo2 extends demo1{

    demo2(){
        this(5);
        System.out.println("inside cons of demo2");
    }
    demo2(int i){
        System.out.println("inside cons of demo2 but requires int");
    }
}

public class super_demo {

    public static void main(String args[]){

        demo2 ds = new demo2();
    }
    
}
