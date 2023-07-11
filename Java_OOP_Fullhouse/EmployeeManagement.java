package Java_OOP_Fullhouse;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement implements IDataManagement, IBasicManagement, IAdvancedManagement {

    private ArrayList<Employee> employeeList;

    // private String fileOpen = "\"E:\\Java Visual Studio Code\\Java_OOP_Fullhouse\\MyData.txt\"";

    public EmployeeManagement() {
    }

    @Override
    public boolean loadDataFromFile(String pathFile) {
        return false;

    }

    @Override
    public boolean saveDataToCurrentFile() {
        return false;
    }

    @Override
    public boolean saveDataAs(String pathFile) {
        return false;
    }

    @Override
    public boolean create(Employee e) {
        this.employeeList.add(e);
        return true;
    }

    @Override
    public Employee getByID(int ID) {
        if (true) {

        }
        return null;
    }

    @Override
    public boolean update(Employee e) {
        return false;
    }

    @Override
    public Employee deleteByID(int ID) {
        return null;
    }

    @Override
    public void showAll() {
    }

    @Override
    public List<Employee> sortByName() {
        return employeeList;
    }

    @Override
    public List<Employee> sortByLastName() {
        return employeeList;
    }

    @Override
    public List<Employee> sortByAge() {
        return employeeList;
    }

    @Override
    public List<Employee> sortBySalary() {
        return employeeList;

    }

    @Override
    public List<Employee> filterByLastName(String lastName) {
        return employeeList;
    }

    @Override
    public List<Employee> filterByAge(int age) {
        return employeeList;
    }

    @Override
    public List<Employee> filterByAge(int begin, int end) {
        return employeeList;
    }

    @Override
    public List<Employee> filterBySalary(double salary) {
        return employeeList;
    }

    @Override
    public List<Employee> filterBySalary(double begin, double end) {
        return employeeList;
    }

}
