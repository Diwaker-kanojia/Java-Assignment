package Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setAge(21);
        student1.setGrade('A');
        System.out.println("---------- Student Details ----------");
        System.out.println("Name : " + student1.getName());
        System.out.println("Age : " + student1.getAge());
        System.out.println("Grade : " + student1.getGrade());
    }
}
