package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void containsDuplicateTest() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
        Assert.assertFalse(solution.containsDuplicate(new int[]{99,54,62,134,754,33}));
        Assert.assertTrue(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        Assert.assertTrue(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3}));

    }

}