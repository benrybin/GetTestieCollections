package rocks.zipcode;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TreeSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestSet1() {
        Set<String> stack = new java.util.TreeSet<>();
        stack.add("Hello world");
        assertEquals("Hello world", stack.iterator().next()); // false
    }
}
