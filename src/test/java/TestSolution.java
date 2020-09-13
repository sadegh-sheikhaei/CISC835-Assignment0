import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testSum() {
        Assert.assertEquals(5, new Solution().sum(3,2));
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
    public void testProd() {
        Assert.assertEquals(6, new Solution().prod(3, 2));
    }
}
