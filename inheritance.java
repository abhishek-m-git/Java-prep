class calc{

    public  int add(int i,int j){
        return i+j;
    } 
    public int sub(int i,int j){
        return i+j;
    }
}

class advcalc extends calc{

    public int mult(int i,int j){
        return i*j;
    }

    public int div(int i,int j){
        return i/j;
    }   
}


public class inheritance {
    public static void main(String args[]){

        advcalc r1 = new advcalc();

        int v1 = r1.add(5, 3);
        int v2 = r1.sub(10, 5);
        int v3 = r1.mult(2, 3);
        int v4 = r1.sub(8, 2);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

    }

}
