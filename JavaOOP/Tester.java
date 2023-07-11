package JavaOOP;

public class Tester extends Employee {

    private String type;

    Tester() {

    }

    Tester(int id, String name, int age, int baseSalary, String type) {
        super(id, name, age, baseSalary);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getSalary() {
        if (type.equals("administrative tester")) {
            this.setBaseSalary((int) (this.getBaseSalary() + 0.25 * this.getBaseSalary()));
            return this.getBaseSalary();
        } else {
            this.setBaseSalary((int) (this.getBaseSalary() + 0.05 * this.getBaseSalary()));
            return this.getBaseSalary();
        }
    }

    @Override
    public Tester copy() {
        Tester tester = new Tester(this.getID(), this.getName(), this.getAge(), this.getBaseSalary(), this.getType());
        return tester;
    }

    // @Override
    // void printInformation() {
    //     System.out.printf("Tester[id = %d, name = %s, age = %d, baseSalary = %d, type = %s]", id, name, age, baseSalary,
    //             type);
    // }

    public String toString(){
        return "Tester{" + "type=" + this.type + '}';
    }

}
