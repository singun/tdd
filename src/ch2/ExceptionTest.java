package ch2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExceptionTest {

    @Test
    public void testExceptionJUnit3Style() {
        String value = "a108";
        try {
            System.out.println(Integer.parseInt(value));
            assertTrue(false);
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test(expected = NumberFormatException.class)
    public void testExceptionJUnit4Style() {
        String value = "a108";
        System.out.println(Integer.parseInt(value));
    }
}
