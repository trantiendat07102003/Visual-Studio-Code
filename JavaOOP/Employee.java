package JavaOOP;

public abstract class Employee {

    private int id;
    private String name;
    private int age;
    private int baseSalary;

    public Employee() {

    }

    public Employee(int id, String name, int age, int baseSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        if (age <= 17) {
            baseSalary = baseSalary + (0 * baseSalary);
            return baseSalary;
        } else {
            if (age >= 18 && age <= 25) {
                baseSalary = (int) (baseSalary + (0.03 * baseSalary));
                return baseSalary;
            } else {
                if (age >= 26 && age <= 35) {
                    baseSalary = (int) (baseSalary + (0.06 * baseSalary));
                    return baseSalary;
                } else {
                    baseSalary = (int) (baseSalary + (0.1 * baseSalary));
                    return baseSalary;
                }
            }
        }
    }

    // Employee copy() {
    //     Employee employee = new Employee(id, name, age, baseSalary);
    //     return employee;
    // }

    public abstract Employee copy();

    // void printInformation() {
    //     System.out.printf("Employee [id = %d, name = %s, age = %d, baseSalary = %d]", id, name, age, baseSalary);
    // }



}
