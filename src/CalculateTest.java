import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CalculateTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Calculate.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void addition() {
        Calculate calc = new Calculate(4);
        assertEquals(calc.addition(3).getValue(), 7);
    }

    @Test
    public void subtraction() {
        Calculate calc = new Calculate(4);
        assertEquals(calc.subtraction(3).getValue(), 1);
    }

    @Test
    public void multiply() {
        Calculate calc = new Calculate(4);
        assertEquals(calc.multiply(3).getValue(), 12);
    }

    @Test
    public void division() {
        Calculate calc = new Calculate(4);
        assertEquals(calc.division(3).getValue(), 4/3);
    }
}
