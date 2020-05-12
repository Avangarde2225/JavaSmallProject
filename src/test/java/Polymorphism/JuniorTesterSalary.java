package Polymorphism;

public class JuniorTesterSalary extends TesterBaseSalary {
    public int getSalary(){
         return super.getSalary() - 50000;
    }

}
