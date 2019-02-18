package nc.sonartest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Number1Test {

    protected Number1 number1;

    @Before
    public void setUp() throws Exception {
        number1 = new Number1();
    }

    @Test
    public void name() {
        assertEquals("A", number1.returnA());
    }

    @Test
    public void name2() {
        assertEquals("B7", number1.returnB());
    }
}