package Patterns.Composite;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
private Sum sum;
    @Before
    public void setUp() throws Exception {
        sum = new Sum();
    }

    @Test
    public void compute() {
        assertEquals(57, 12+45);
    }
}