package MathEqu;

public class Subtracter extends CalculateBase{

    @Override
    public void calculate() {
    double value = getLeftVal() - getRightVal();
    setResult(value);
    }

    public Subtracter() {
    }

    public Subtracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
}
