package ch2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayTest {

    @Test
    public void testSortedArrayAssertEquals() throws Exception {
        String[] names = {"Tom", "Jimmy", "Johin"};
        String[] anotherNames = {"Tom", "Jimmy", "Johin"};
        assertArrayEquals(names, anotherNames);
    }

    @Test
    public void testUnsortedArrayAssertEquals() throws Exception {
        String[] names = {"Tom", "Jimmy", "Johin"};
        String[] anotherNames = {"Tom", "Johin", "Jimmy"};
        assertArrayEquals(names, anotherNames);
    }
}
