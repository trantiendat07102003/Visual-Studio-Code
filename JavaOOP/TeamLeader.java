package JavaOOP;

public class TeamLeader extends Developer {

    private double bonusRate;

    TeamLeader() {

    }

    TeamLeader(int id, String name, int age, int baseSalary, int expYear, String teamName, double bonusRate) {
        super(id, name, age, baseSalary, expYear, teamName);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double getSalary() {
        this.setBaseSalary((int) (this.getBaseSalary() + this.getBonusRate() * this.getBaseSalary()));
        return this.getBaseSalary();
    }

    @Override
    public TeamLeader copy() {
        TeamLeader teamLeader = new TeamLeader(this.getID(), this.getName(), this.getAge(), this.getBaseSalary(), this.getExpYear(), this.getTeamName(), this.getBonusRate());
        return teamLeader;
    }

    // @Override
    // void printInformation() {
    //     System.out.printf(
    //             "TeamLeader[id = %d, name = %s, age = %d, baseSalary = %d, expYear = %d, teamName = %s, bonusRate = %.3f]",
    //             id, name, age, baseSalary, expYear, teamName, bonusRate);
    // }

    @Override
    public String toString(){
        return "TeamLeader{" + "bonusRate=" + this.bonusRate + '}';
    }

}
