package Patterns.Composite;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondClassTest {

    private SecondClass secondClass;
    @Before
    public void setUp() throws Exception {
        secondClass = new SecondClass();
    }

    @Test
    public void compute() {
        assertEquals(45, 5*(3+6));
    }
}