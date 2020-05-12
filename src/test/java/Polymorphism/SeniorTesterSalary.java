package Polymorphism;

public class SeniorTesterSalary extends TesterBaseSalary{
    public int getSalary(){
        return super.getSalary() + 100000;
    }
}
