package Learning.SOmeMoreConcepts.ProgramsPractice.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

        Vehicle vCar = new Car();
        // Car cVehicle =  new Vehicle();
        // Car cVehicle = (Car) new Vehicle(); // Cannot cast
        castTest(v);
        castTest(vCar);
        castTest(c);

        // Runtime Polymorphism
        c.start();
        v.start();
        Plane p = new Plane();
        p.start();
        
        

    }

    private static void castTest(Vehicle veh){

    }
}
