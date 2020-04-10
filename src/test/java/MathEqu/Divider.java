package MathEqu;

public class Divider extends CalculateBase {
    @Override
    public void calculate() {
    double value = getLeftVal() / getRightVal();
    setResult(value);
    }

    public Divider() {
    }

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
}
