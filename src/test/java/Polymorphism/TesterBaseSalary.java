package Polymorphism;

public class TesterBaseSalary {

    public TesterBaseSalary(){

    }

    public int getSalary(){
        return 100000;
    }

    public static void main(String[] args) {
        TesterBaseSalary [] salaries = {new JuniorTesterSalary(), new MidTesterSalary(), new SeniorTesterSalary()};
        for(TesterBaseSalary salary : salaries){
            System.out.println(salary.getSalary());
        }

    }
}
