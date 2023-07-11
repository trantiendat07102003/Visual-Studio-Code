package JavaOOP;

public interface IBasicManagement {

    public abstract boolean create(Employee e);

    public abstract Employee getByID(int ID);

    public abstract boolean update(Employee e);

    public abstract Employee deleteByID(int ID);

    public abstract void showAll();

}
