package MathEqu;

public class Multiplier extends CalculateBase {
    @Override
    public void calculate() {
    double value = getLeftVal() * getRightVal();
    setResult(value);
    }

    public Multiplier() {
    }

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
}
