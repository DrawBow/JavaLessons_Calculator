import org.junit.Test;

public class Calculate {

    private double value;

    public double getValue() {
        return value;
    }

    // Constructor
    public Calculate(double value) {
        this.value = value;
    }

    private void checkZeroValue(Number value) throws ArithmeticException {
        if ((value instanceof Integer) & (value.intValue() == 0))
            throw new ArithmeticException();
    }

    public Calculate addition(Number value) {
       return value.doubleValue() == 0 ? this: new Calculate(this.value + value.doubleValue());
    }

    public Calculate subtraction(Number value) {
        return value.doubleValue() == 0 ? this: new Calculate(this.value - value.doubleValue());
    }

    public Calculate multiply(Number value) {
        return value.doubleValue() == 1 ? this: new Calculate(this.value * value.doubleValue());
    }

    public Calculate division(Number value) throws ArithmeticException {
        checkZeroValue(value);
        return new Calculate(this.value / value.doubleValue());
    }
}
