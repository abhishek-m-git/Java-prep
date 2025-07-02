class Car {
    String color;  // instance variable (stored in heap)

    void drive(String driverName) {  // method with argument
        int speed = 60;  // local variable (stored in stack)
        System.out.println(driverName + " is driving a " + color + " car at " + speed + " km/h");
    }
}

public class stac_vs_heap {
    public static void main(String[] args) {
        int x = 100;  // useless local variable in main (stored in stack)

        Car myCar = new Car();  // object created (myCar ref in stack, object in heap)
        myCar.color = "Red";    // setting instance variable (heap)
        myCar.drive("Abhishek");  // method call with argument
    }
}
