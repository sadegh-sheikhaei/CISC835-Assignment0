import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testSum() {
        Assert.assertEquals(5, new Solution().sum(3,2));
    }

    @Test
    public void testSum2() {
        Assert.assertEquals(0, new Solution().sum(0,0));
        Assert.assertEquals(-12, new Solution().sum(-10,-2));
        Assert.assertEquals(1100, new Solution().sum(1000,100));
    }

    @Test
    public void testDiff1() {
        Assert.assertEquals(1, new Solution().diff(3,2));
    }

    @Test
    public void testDiff2() {
        Assert.assertEquals(-1, new Solution().diff(2,3));
    }

    @Test
    public void testDiff3() {
        Assert.assertEquals(0, new Solution().diff(0,0));
        Assert.assertEquals(-8, new Solution().diff(-10,-2));
        Assert.assertEquals(900, new Solution().diff(1000,100));
    }

    @Test
    public void testProd() {
        Assert.assertEquals(6, new Solution().prod(3, 2));
    }

    @Test
    public void testProd2() {
        Assert.assertEquals(0, new Solution().prod(5, 0));
        Assert.assertEquals(-5, new Solution().prod(5, -1));
        Assert.assertEquals(100000, new Solution().prod(1000, 100));
    }
}

