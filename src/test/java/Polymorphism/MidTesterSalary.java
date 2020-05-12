package Polymorphism;

public class MidTesterSalary extends TesterBaseSalary {

    public int getSalary(){
        return super.getSalary() + 50000;
    }
}
