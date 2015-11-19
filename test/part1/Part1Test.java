package part1;

import org.junit.Test;
import part2.Part2;

import static org.junit.Assert.assertEquals;

public class Part1Test {

    @Test
    public void testSolve() throws Exception {
        assertEquals(new Part1().solve(), 2);
    }
}