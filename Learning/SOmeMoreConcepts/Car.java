package Learning.SOmeMoreConcepts;

public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String modelNUmber;
    String companyName;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String modelNUmber, String companyName) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.modelNUmber = modelNUmber;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Car [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed
                + ", modelNUmber=" + modelNUmber + ", companyName=" + companyName + "]";
    }

    public static void main(String[] args) {
        Car swiftCar = new Car(4,4,120,"DAYM112", "Nissan");
        System.out.println(swiftCar.toString());

        String a = "abc";
        System.out.println(a);
    }
    
}
