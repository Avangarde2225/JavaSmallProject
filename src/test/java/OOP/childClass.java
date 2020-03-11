package OOP;


public class childClass implements interfaceRecap  {

    public static void main(String[] args) {

//        i1=20; not going to work because all the variables are final in the interface


    }

//    override should have same type and same count of parameters
    @Override
    public void method1(int i1) {

    }

    /*
    override
    1)override runtime polymorphism
    2)override should have same type and same count of parameters
    3)override can not have a different type of return type
    4)Override is in the two different classes (parent and child)
    5)I can NOT override static and private method

    overload
    1)overload compile time polymorphism
    2)overload should have different type or count of parameters
    3)overload can have same or different return type
    4)overload should be in the same class
    5)I can overload static and private method
     */

//   overload should have different type or count of parameters
        public void method2(String s2){

        }

        public void method2(int i1){


        }

        public int method2(int i1 , int i2){

            return 2;
        }

        public int method2(int i1){

            return 4;
        }



}
