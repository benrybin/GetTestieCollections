package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class VectorTest {
    Vector<String> stack = new Vector<>();

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestSet1() {

        stack.add("Hello world");
        assertEquals("Hello world", stack.get(0)); // false
    }
    @Test
    public void TestSet2() {
        stack.add("1");
        stack.add("2");
        stack.add("3");

        assertEquals(3, stack.size()); // false
    }
    @Test
    public void TestSet3() {
        stack.add("1");
        stack.add("2");
        stack.add("3");

        assertEquals(true, stack.contains("1")); // false
    }
    @Test
    public void TestSet4() {
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.remove(0);

        assertEquals(false, stack.contains("1")); // false
    }
}
