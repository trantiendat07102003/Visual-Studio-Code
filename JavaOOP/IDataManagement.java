package JavaOOP;

public interface IDataManagement {

    public abstract boolean loadDataFromFile(String pathFile);

    public abstract boolean saveDataToCurrentFile();

    public abstract boolean saveDataAs(String pathFile);

}
