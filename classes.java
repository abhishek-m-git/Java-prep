class calculator{

    int i = 100;

    // public int add(int j,int k){
    public void add(int j,int k){

        // System.out.println("inside add"); 

        // int r = j+k; 
        // return r;

        System.out.println(j+k);

    }
}

class classes {

    public static void main(String args[]){

        calculator cal = new calculator();

        // int r = cal.add(2, 3);
        // System.out.println(r);

        cal.add(5,6);
    }

    
}
 