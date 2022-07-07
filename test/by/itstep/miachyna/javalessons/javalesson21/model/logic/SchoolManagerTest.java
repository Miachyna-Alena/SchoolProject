package by.itstep.miachyna.javalessons.javalesson21.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SchoolManagerTest {
    @Test
    public void testCalculateAvgMarkPositive() {
        int[][] groups = {
                {7, 8, 9},
                {9, 8, 9, 10},
                {7, 7}};

        double expected = 8.0;
        double actual = SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.01);
    }
}
