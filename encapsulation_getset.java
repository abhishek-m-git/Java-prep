class demo{

    private String name;
    private int age;
    
    public void setName(String name) {      //getter
        this.name = name;
    }
   
    public String getName() {       //setter
        return name;
    }

    public int getAge() {       //getter
        return age;
    }

    public void setAge(int age) {       //setter
        this.age = age;
    }
}

public class encapsulation_getset {

    
    public static void main(String args[]){

        demo ds = new demo();

        ds.setName("Navin");
        System.out.println(ds.getName());

        ds.setAge(21);
        System.out.println(ds.getAge());
    }
}
