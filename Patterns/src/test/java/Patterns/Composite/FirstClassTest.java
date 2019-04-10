package Patterns.Composite;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstClassTest {
private FirstClass firstClass;
    @Before
    public void setUp() throws Exception {
firstClass = new FirstClass();
    }

    @Test
    public void compute() {
        assertEquals(12, (1+2)*4);
    }
}