public class Vehicle {

    public static void main(String[] args) {

        Truck truck = new Truck();

        System.out.println("Type: " + truck.type);
        System.out.println("Mass: " + truck.massInKg);
        System.out.println("Length: " + truck.lengthCm);
        System.out.println("Max Speed: " + truck.maxSpeedKmH);
        System.out.println("Type of engine: " + truck.typeOfEngine);
        System.out.println("Driveable? : " + truck.driveable);
        System.out.println("");


        truck.maxMassLoad();
        System.out.println("Mass with Load:" + truck.massInKg);
        System.out.println("");

//        Car car = new Car();
//
//        System.out.println("Type: " + car.type);
//        System.out.println("Mass: " + car.massInKg);
//        System.out.println("Length: " + car.lengthCm);
//        System.out.println("Max Speed: " + car.maxSpeedKmH);
//        System.out.println("Type of engine: " + car.typeOfEngine);
//        System.out.println("Driveable? : " + car.driveable);
//        System.out.println("");
//
//
//        truck.maxMassLoad();
//        System.out.println("Mass with Load:" + car.massInKg);



    }
}
