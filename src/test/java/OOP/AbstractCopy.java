package OOP;

public abstract class AbstractCopy {

    /*
        Abstract                vs
        1)Abstract can have final and non final variables
        2)Abstract I use extend keyword
        3)I can extend one abstract class
        4) In abstract I can use constructed
        5) I can have abstract and non abstract methods

        Interface
        1) All the variables are static and final
        2) Interface I use implement keyword
        3) I can implement multiple interfaces
        4) In interface I can NOT use constructed (Bc all the variables are final)
        5) All the methods are abstract (abstract methods doesnt have a body )

     */


    public static void main(String[] args) {

        //1)Abstract can have final and non final variables
        int i1 = 10;
        final int i2 = 20;
//        i2 = 30;   not going to work because i2 is final
        i1 = 30;
        System.out.println(i1);




    }





}
