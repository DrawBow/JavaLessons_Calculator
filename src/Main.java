
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Calculate calc = new Calculate(4);
        out.println("Calculator");
        out.printf("ADD 4 + 3 = %f\n", calc.addition(3).getValue());
        out.printf("ADD 4 / 3 = %f\n", calc.division(3).getValue());
        out.printf("ADD 4 * 3 = %f\n", calc.multiply(3).getValue());
        out.printf("ADD 4 - 3 = %f\n", calc.subtraction(3).getValue());
    }
}
