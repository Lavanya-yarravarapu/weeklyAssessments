package date_25_04_2024;

class Person {
    private String name;
    protected int age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.age = 30;
        emp.address = "123 Main St";
        emp.display();
    }
}


