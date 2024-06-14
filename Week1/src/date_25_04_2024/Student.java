package date_25_04_2024;

class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.printDetails();
    }
}

