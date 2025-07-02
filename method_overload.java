
class overload{

    public void add(int j,int k){
        System.out.println(j+k);
    }

    public void add(int j, int k, int l){
        System.out.println(j+k+l);
    }
}

public class method_overload {
    

    public static void main(String args[]){

        overload load = new overload();

        load.add(1, 2);
        load.add(1, 2 , 3);

    }
}
