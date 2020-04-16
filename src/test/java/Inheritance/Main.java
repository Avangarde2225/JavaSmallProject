package Inheritance;

public class Main {
    public static void main(String[] args) {
        EducationalCreditManager educationCredit = new EducationalCreditManager();
        //educationCredit.calculate();
        FarmCreditManager farmCredit = new FarmCreditManager();

        CreditUI creditUI = new CreditUI();
        creditUI.creditCalculate(new EducationalCreditManager());

    }

}
