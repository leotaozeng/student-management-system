public class Student {
    private int id;
    private int age;
    private String name;
    private String grade; // For example, A+/A/A-

    // Create a class constructor for the Student class
    public Student(int id, int age, String name, String grade) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.grade = grade;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
