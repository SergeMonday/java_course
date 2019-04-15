public class Truck {

    String type = "Truck";
    int massInKg = 5000;
    int lengthCm = 1500;
    boolean driveable = true;
    byte maxSpeedKmH = 120;
    char typeOfEngine = 'V';

    public void maxMassLoad() {

        massInKg = massInKg + 7000;

    }

    public Truck() {
        driveable = false;
        System.out.println("Call Truck");
    }

    public Truck(String smth) {
        driveable = false;
        System.out.println("Call Truck");
    }

}
