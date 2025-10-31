public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Tata", "Punch", 2024, 4),
                new Bike("Royal Enfield", "GT 650", 2023, "Cafe Racer"),
                new Truck("Tata", "Tata prima", 2022, 3530.5) };
        for (

        Vehicle vehicle : vehicles) {
            System.out.println("----- Vehicle Details -----");
            vehicle.startEngine();
            vehicle.displayInfo();
            System.out.println("Vehicle Age: " + vehicle.calculateAge(2025) + " years");
            System.out.println();
        }
    }

}
