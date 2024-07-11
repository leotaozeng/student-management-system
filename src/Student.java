public class Student {
    private int id;
    private String name;
    private int age;
    private double grades;

    // Create a class constructor for the Student class
    public Student(int id, String name, int age, double grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
}
