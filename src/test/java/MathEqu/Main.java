package MathEqu;

public class Main {
    public static void main(String[] args) {


        MathEquation[] equation = new MathEquation[4];
        equation[0] = create(100.0d, 50.0d, 'd');
        equation[1] = create(25.0d, 92.0d, 'a');
        equation[2] = create(225.0d, 17.0d, 's');
        equation[3] = create(11.0d, 3.0d, 'm');

        for (MathEquation equations: equation){
            equations.execute();
            System.out.println("result = ");
            System.out.println(equations.result);
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble,rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverload.result);

    }
    public static MathEquation create (double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }

}
