package HomeTask2;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testIsMax() {
        Assert.assertEquals(3, Main.isMax(1, 2, 3));
    }

    @Test
    public void testIsMin() {
        Assert.assertEquals(1, Main.isMin(1, 2, 3));
    }

    @Test
    public void testGetAVG() {
        Assert.assertEquals(2, Main.getAVG(1, 2, 3), 0);
    }

}