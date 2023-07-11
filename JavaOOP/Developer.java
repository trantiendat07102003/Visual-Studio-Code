package JavaOOP;

public class Developer extends Employee {

    private int expYear;
    private String teamName;
    
    public Developer() {

    }

    public Developer(int id, String name, int age, int baseSalary, int expYear, String teamName) {
        super(id, teamName, age, baseSalary);
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
        if (expYear < 4) {
            return this.getBaseSalary();
        } else {
            if (expYear >= 4 && expYear <= 7) {
                this.setBaseSalary((int) (this.getBaseSalary() + 0.04 * this.getBaseSalary()));
                return this.getBaseSalary();
            } else {
                if (expYear >= 8 && expYear <= 10) {
                    this.setBaseSalary((int) (this.getBaseSalary() + 0.08 * this.getBaseSalary()));
                    return this.getBaseSalary();
                } else {
                    this.setBaseSalary((int) (this.getBaseSalary() + 0.12 * this.getBaseSalary()));
                    return this.getBaseSalary();
                }
            }
        }

        // if (this.getExpYear() < 4) {
        // return this.getBaseSalary();
        // } else if (this.getExpYear() >= 4 && this.getExpYear() <= 7) {
        // return this.getBaseSalary() + (0.04 * this.getBaseSalary());
        // } else if (this.getExpYear() >= 8 && this.getExpYear() <= 10) {
        // return this.getBaseSalary() + (0.08 * this.getBaseSalary());
        // } else if (this.getExpYear() >= 11) {
        // return this.getBaseSalary() + (0.12 * this.getBaseSalary());
        // }
        // return this.getBaseSalary();
    }

    @Override
    public Developer copy() {
        Developer developer = new Developer(this.getID(), this.getName(), this.getAge(), this.getBaseSalary(),
                this.getExpYear(), this.getTeamName());
        return developer;
    }

    // @Override
    // void printInformation() {
    // System.out.printf("Developer[ ID = %d, Name = %s, Age = %d, BaseSalary =
    // %d,ExpYear = %d, TeamName = %s]", id,
    // name, age, baseSalary, expYear, teamName);
    // }

    @Override
    public String toString() {
        return "Developer{" + "expYear=" + this.expYear + ", teamName=" + this.teamName + '}';
    }

}
