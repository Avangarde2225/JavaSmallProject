package Interfaces;

public class MySqlDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("My sql has been added");
    }
}
