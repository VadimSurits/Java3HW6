import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OptimizedTestArray2 {
    private int[] incoming;
    private boolean indicator;

    public OptimizedTestArray2(int[] incoming, boolean indicator) {
        this.incoming = incoming;
        this.indicator = indicator;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true},
                {new int[]{1, 1, 1, 1, 1, 1}, false},
                {new int[]{4, 4, 4, 4}, false},
                {new int[]{1, 4, 4, 1, 1, 4, 3}, false},
        });
    }

    @Test
    public void optimizedTestIsOnly1and4Arr() {
        Assert.assertEquals(indicator, MainHW6.isOnly1and4Arr(incoming));
    }
}
