import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class LinkedListTest {

    @Test
    public void show() {

    }

    @Test
    public void addOutOfRange() {
        LinkedList test = new LinkedList();
        test.addTail(1);
        test.addTail(2);
        assertFalse(test.addAtPosition(10, 45));
    }

    @Test
    public void addNegativeRange() {
        LinkedList test = new LinkedList();
        test.addTail(1);
        test.addTail(2);
        assertFalse(test.addAtPosition(10, -1));
    }


    @Test
    public void addHead() {
    }

    @Test
    public void addAtPosition() {
    }
}