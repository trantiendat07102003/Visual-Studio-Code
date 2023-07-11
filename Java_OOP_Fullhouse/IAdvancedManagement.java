package Java_OOP_Fullhouse;

import java.util.List;

public interface IAdvancedManagement {

    public abstract List<Employee> sortByName();

    public abstract List<Employee> sortByLastName();

    public abstract List<Employee> sortByAge();

    public abstract List<Employee> sortBySalary();

    public abstract List<Employee> filterByLastName(String lastName);

    public abstract List<Employee> filterByAge(int age);

    public abstract List<Employee> filterByAge(int begin, int end);

    public abstract List<Employee> filterBySalary(double salary);

    public abstract List<Employee> filterBySalary(double begin, double end);

}
