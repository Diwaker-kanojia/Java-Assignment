package Parent;

public class Main {
    public static void main(String[] args) {
        Employee[] manager = new Manager[3];
        Employee[] developer = new Developer[3];

        for (int i = 0; i < manager.length; i++) {
            manager[i] = new Manager();
        }

        for (Employee employee : manager) {
            employee.work();
        }

        for (int i = 0; i < developer.length; i++) {
            developer[i] = new Developer();
        }

        for (Employee employee : developer) {
            employee.work();
        }
    }
}
