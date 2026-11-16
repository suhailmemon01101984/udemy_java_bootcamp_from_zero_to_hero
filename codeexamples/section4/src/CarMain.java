public class CarMain {

    static {
        System.out.println("static block from the same class: CarMain"); // this proves that static initialization block runs before main
        //System.exit(0); // this proves that main will not be invoked at all. it will simply exit here.
    }

    public static void main(String[] args) {
        System.out.println("Main method invocation started....");
        Car car1 = new Car();
        Car car2 = new Car("Camry", "Black", 200);
        System.out.println(Car.noOfEngines);
        System.out.println(Car.NO_OF_WHEELS);
//        Car.noOfWheels = 6;
        System.out.println(Car.NO_OF_WHEELS);
    }
}
