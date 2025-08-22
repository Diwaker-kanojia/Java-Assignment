class Vehicle {
    protected void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    protected void move() {
        System.out.println("Car is moving on 4 wheels");
    }
}

class Bicycle extends Vehicle {
    protected void move() {
        System.out.println("Bicycle is moving on 2 wheels");
    }
}

class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.move();

        Bicycle atlas = new Bicycle();
        atlas.move();

    }
}
