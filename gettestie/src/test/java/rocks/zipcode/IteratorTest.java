package rocks.zipcode;

import java.util.Iterator;

public class IteratorTest {
    Iterator stack = new Iterator() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    };
}
