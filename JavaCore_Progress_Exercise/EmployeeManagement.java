package JavaCore_Progress_Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeManagement implements IDataManagement, IBasicManagement {

    private ArrayList<Employee> employeeList;

    private String fileOpen;

    public EmployeeManagement() {
        this.employeeList = new ArrayList<Employee>();
    }

    @Override
    public boolean create(Employee e) {
        if(this.getByID(e.getID()) == null){
            this.employeeList.add(e);
            return true;
        }
        return false;
    }

    @Override
    public Employee getByID(int ID) {
        for(Employee e : this.employeeList){
            if(e.getID() == ID){
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean update(Employee e) {
        Employee updateE = this.getByID(e.getID());
        if(updateE != null){
            updateE.setName(fileOpen);
        }
        
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
        this.fileOpen = pathFile;
        File file = new File(pathFile);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while(true){
                line = br.readLine();
                if(line != null){
                    String[] subInfos = line.split(", ");
                    if(subInfos.length == 6){
                        this.employeeList.add(new Developer(Integer.parseInt(subInfos[0]),subInfos[1],
                        Integer.parseInt(subInfos[2]),
                        Integer.parseInt(subInfos[3]),
                        Integer.parseInt(subInfos[4]),
                        subInfos[5]));
                    }else if(subInfos.length == 7){
                        this.employeeList.add(new TeamLeader(Integer.parseInt(subInfos[0]),
                        subInfos[1],
                        Integer.parseInt(subInfos[2]),
                        Integer.parseInt(subInfos[3]),
                        Integer.parseInt(subInfos[4]),
                        subInfos[5],
                        Double.parseDouble(subInfos[6])));
                    }else {
                        this.employeeList.add(new Tester(Integer.parseInt(subInfos[0]),
                        subInfos[1],
                        Integer.parseInt(subInfos[2]),
                        Integer.parseInt(subInfos[3]),
                        subInfos[4]));
                    }
                }else {
                    break;
                }
            }
            br.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error on method loadDataFromFile!");
        }
        return false;
        
    }

    @Override
    public boolean saveDataToCurrentFile() {
        if(this.fileOpen != null){
            File file = new File(this.fileOpen);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                for(Employee e : this.employeeList){
                    bw.write(e.writeToFile() + "\n");
                }
                bw.close();
                return true;
            } catch (IOException e) {
                System.out.println("Error on method saveDataToCurrentFile");
            }
        }
        return false;
    }

    @Override
    public boolean saveDataAs(String pathFile) {
        File file = new File(pathFile);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(Employee e : this.employeeList){
                bw.write(e.writeToFile() + "\n");
            }
            bw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error on method saveDataAs!");
        }
    }
    return false;

}
