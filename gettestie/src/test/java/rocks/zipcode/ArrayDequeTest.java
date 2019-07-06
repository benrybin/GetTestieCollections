package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {
    Deque<String> stack = new ArrayDeque<>();

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestSet1() {

        stack.add("Hello world");
        assertEquals("Hello world", stack.peekFirst()); // false
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
        stack.removeFirstOccurrence("1");

        assertEquals(false, stack.contains("1")); // false
    }
}
