package Student;

public class Student {
    private String name;
    private int age;
    private char grade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be greater than 0.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGrade(char grade) {

        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade! Grade must be between A and F.");
            this.grade = '-';
        }
    }

    public char getGrade() {
        return grade;
    }
}
