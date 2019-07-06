package rocks.zipcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class HashSetTest {


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestSet1() {
        Set<String> stack = new HashSet<>();
        stack.add("Hello world");
        assertEquals("Hello world", stack.iterator().next()); // false
    }
}
