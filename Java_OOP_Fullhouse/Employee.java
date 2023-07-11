package Java_OOP_Fullhouse;

public abstract class Employee {

    private int ID;
    private String name;
    private int age;
    private int baseSalary;

    public Employee() {

    }

    public Employee(int ID, String name, int age, int baseSalary) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        if (age <= 17) {
            return baseSalary + (0 * baseSalary);
        } else if (18 <= age && age <= 25) {
            return baseSalary + (0.03 * baseSalary);
        } else if (26 <= age && age <= 35) {
            return baseSalary + (0.06 * baseSalary);
        } else {
            return baseSalary + (0.1 * baseSalary);
        }
    }

    public abstract Employee copy();

    // public void printInformation() {
    // System.out.printf("id = %d, name = %s, age = %d, baseSalary = %d",
    // this.getID(), this.getName(), this.getAge(), this.getBaseSalary());
    // }
}
