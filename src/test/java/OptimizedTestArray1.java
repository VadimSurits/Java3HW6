import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OptimizedTestArray1 {
    private int[] incoming;
    private int [] outcoming;

    public OptimizedTestArray1 (int[] incoming, int[] outcoming) {
        this.incoming = incoming;
        this.outcoming = outcoming;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[] {1,2,4,4,2,3,4,1,7}, new int[]{1,7}},
                {new int[] {1,2,4,10,5,6,3,4,8,2,6,3,19}, new int[]{8,2,6,3,19}},
                {new int[] {1,2,4,4,2,3,4,1,4}, new int[]{}}
        });
    }

    @Test
    public void optimizedTestAfterLast4Arr(){
        Assert.assertArrayEquals(outcoming,MainHW6.afterLast4Arr(incoming));
    }
}
