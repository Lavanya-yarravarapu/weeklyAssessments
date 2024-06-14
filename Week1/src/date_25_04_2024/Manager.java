package date_25_04_2024;



public class Manager {
    public String name;
    public int id;

    public Manager(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

