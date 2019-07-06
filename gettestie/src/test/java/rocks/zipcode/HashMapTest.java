package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HashMapTest {


        Map<String, String> stack = new HashMap<>();

        @org.junit.Before
        public void setUp() throws Exception {

        }

        @org.junit.After
        public void tearDown() throws Exception {
        }

        @org.junit.Test
        public void TestSet1() {

            stack.put("Ben", "Rybinski");
            assertEquals(true, stack.containsValue("Rybinski")); // false
        }

        @Test
        public void TestSet2() {
            stack.put("1", "A");
            stack.put("2", "B");
            stack.put("3", "C");

            assertEquals(3, stack.size()); // false
        }

        @Test
        public void TestSet3() {
            stack.put("1", "A");
            stack.put("2", "B");
            stack.put("3", "C");

            assertEquals(true, stack.containsKey("1")); // false
        }

        @Test
        public void TestSet4() {
            stack.put("1", "A");
            stack.put("2", "B");
            stack.put("3", "C");
            stack.remove("1");

            assertEquals(false, stack.containsKey("1")); // false
        }
    }

