package JavaOOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeManagement implements IDataManagement, IBasicManagement {

    private ArrayList<Employee> employeeList;

    private String fileOpen = "E:\\Java Visual Studio Code\\JavaOOP\\MyData.txt";

    public EmployeeManagement() {

    }

    @Override
    public boolean create(Employee e) {
        this.employeeList.add(e);
        if (this.employeeList.get(0).equals(null)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Employee getByID(int ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByID'");
    }

    @Override
    public boolean update(Employee e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Employee deleteByID(int ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByID'");
    }

    @Override
    public void showAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showAll'");
    }

    @Override
    public  boolean loadDataFromFile(String pathFile) {
        pathFile = fileOpen;
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            System.out.println(br.readLine());
        } catch (IOException e) {
            // TODO: handle exception
        }
        return false;
        
    }

    @Override
    public boolean saveDataToCurrentFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveDataToCurrentFile'");
    }

    @Override
    public boolean saveDataAs(String pathFile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveDataAs'");
    }

}
