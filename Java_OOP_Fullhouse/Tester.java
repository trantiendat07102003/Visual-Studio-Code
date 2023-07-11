package Java_OOP_Fullhouse;

public class Tester extends Employee {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Tester() {
    }

    public Tester(String type, int ID, String name, int age, int baseSalary) {
        super(ID, name, age, baseSalary);
        this.type = type;
    }

    @Override
    public double getSalary() {
        if (this.getType().equals("administrative tester")) {
            return this.getBaseSalary() + (0.25 * this.getBaseSalary());
        } else {
            return this.getBaseSalary() + (0.05 * this.getBaseSalary());
        }
    }

    @Override
    public Tester copy() {
        Tester tester = new Tester(this.getType(), this.getID(), this.getName(), this.getAge(), this.getBaseSalary());
        return tester;
    }

    // @Override
    // public void printInformation() {
    // System.out.printf("Tester[id = %d, name = %s, age = %d, baseSalary = %d, type
    // = %s",
    // this.getID(), this.getName(), this.getAge(), this.getBaseSalary(),
    // this.getType());
    // }
    @Override
    public String toString() {
        return "Tester{" + "type=" + this.type + '}';
    }

}
