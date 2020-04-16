package Interfaces;

public class MySqlDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("My sql has been added");
    }
}
