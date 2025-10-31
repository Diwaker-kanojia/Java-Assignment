public class HomeApplianceTest {
    public static void main(String[] args) {
        Appliance[] appliances = {
                new WashingMachine("LG", 1200, 10),
                new Refrigerator("Samsung", 800, 300),
                new Microwave("Panasonic", 1000, true)
        };

        for (Appliance appliance : appliances) {
            System.out.println("----- Appliance Details -----");
            appliance.displayInfo();
            appliance.showFeatures();
            appliance.turnOn();
            appliance.turnOff();
            System.out.println();
        }
    }
}
