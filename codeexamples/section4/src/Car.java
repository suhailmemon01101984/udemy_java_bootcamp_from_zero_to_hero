public class Car {
    String model;
    String color;
    int horsePower;
    static byte noOfWheels=4;


    {
//        this.model = "Camry";
//        this.color = "Black";
//        this.horsePower = 200;
        System.out.println("Car object is being created....");

    }

    public Car() {
    }

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void startCar() {
        System.out.println("Vehicle started...");
    }

    public String stopCar() {
        String output = "Vehical stopped...";
        return output;
    }

}
