package Java_OOP_Fullhouse;

public class Developer extends Employee {

    private int expYear;
    private String teamName;

    public Developer() {
    }

    public Developer(int expYear, String teamName, int ID, String name, int age, int baseSalary) {
        super(ID, name, age, baseSalary);
        this.expYear = expYear;
        this.teamName = teamName;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public double getSalary() {

        if (this.getExpYear() < 4) {
            return this.getBaseSalary();
        } else if (this.getExpYear() >= 4 && this.getExpYear() <= 7) {
            return this.getBaseSalary() + (0.04 * this.getBaseSalary());
        } else if (this.getExpYear() >= 8 && this.getExpYear() <= 10) {
            return this.getBaseSalary() + (0.08 * this.getBaseSalary());
        } else if (this.getExpYear() >= 11) {
            return this.getBaseSalary() + (0.12 * this.getBaseSalary());
        }

        return 0;
    }

    @Override
    public Developer copy() {

        Developer developer = new Developer(this.getExpYear(), this.getTeamName(), this.getID(), this.getName(),
                this.getAge(), this.getBaseSalary());

        return developer;
    }
    //

    // @Override
    // public void printInformation() {
    //
    // System.out.printf("Developer[ ID = %d, Name = %s, Age = %d, BaseSalary = %d,
    // ExpYear = %d, TeamName = %s]",
    // this.getID(), this.getName(), this.getAge(), this.getBaseSalary(),
    // this.getExpYear(), this.getTeamName());
    //
    // }
    @Override
    public String toString() {
        return "Developer{" + "expYear=" + this.expYear + ", teamName=" + this.teamName + '}';
    }

}
