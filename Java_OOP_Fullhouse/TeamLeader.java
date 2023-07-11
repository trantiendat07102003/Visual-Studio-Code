package Java_OOP_Fullhouse;

public class TeamLeader extends Developer {

    private double bonusRate;

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public TeamLeader() {
    }

    public TeamLeader(double bonusRate, int expYear, String teamName, int ID, String name, int age, int baseSalary) {
        super(expYear, teamName, ID, name, age, baseSalary);
        this.bonusRate = bonusRate;
    }

    @Override
    public double getSalary() {
        return this.getBaseSalary() + (this.getBonusRate() * this.getBaseSalary());
    }

    @Override
    public TeamLeader copy() {
        TeamLeader teamLeader = new TeamLeader(this.getBonusRate(), this.getExpYear(), this.getTeamName(), this.getID(),
                this.getName(), this.getAge(), this.getBaseSalary());
        return teamLeader;
    }

    // @Override
    // public void printInformation(){
    // System.out.printf("TeamLeader[id = %d, name = %s, age = %d, baseSalary = %d,
    // expYear = %d, teamName = %s, bonusRate = %d");
    // }
    @Override
    public String toString() {
        return "TeamLeader{" + "bonusRate=" + this.bonusRate + '}';
    }

}
