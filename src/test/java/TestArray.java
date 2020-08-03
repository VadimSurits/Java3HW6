import org.junit.Assert;
import org.junit.Test;

public class TestArray {
    @Test
    public void test1AfterLast4Arr(){
        int[] incoming = {1,2,4,4,2,3,4,1,7};
        int[] outcoming = {1,7};
        Assert.assertArrayEquals(outcoming, MainHW6.afterLast4Arr(incoming));
    }

    @Test
    public void test2AfterLast4Arr(){
        int[] incoming = {1,2,4,10,5,6,3,4,8,2,6,3,19};
        int[] outcoming = {8,2,6,3,19};
        Assert.assertArrayEquals(outcoming, MainHW6.afterLast4Arr(incoming));
    }

    @Test(expected = RuntimeException.class)
    public void test3AfterLast4Arr(){
        int[] incoming = {1,2,10,5,6,3,8,2,6,3,19};
        MainHW6.afterLast4Arr(incoming);
    }

    @Test
    public void test1isOnly1and4Arr(){
        int[] incoming = {1,1,1,4,4,1,4,4};
        Assert.assertTrue(MainHW6.isOnly1and4Arr(incoming));
    }

    @Test
    public void test2isOnly1and4Arr(){
        int[] incoming = {1,1,1,1,1,1};
        Assert.assertFalse(MainHW6.isOnly1and4Arr(incoming));
    }

    @Test
    public void test3isOnly1and4Arr(){
        int[] incoming = {4,4,4,4};
        Assert.assertFalse(MainHW6.isOnly1and4Arr(incoming));
    }

    @Test
    public void test4isOnly1and4Arr(){
        int[] incoming = {1,4,4,1,1,4,3};
        Assert.assertFalse(MainHW6.isOnly1and4Arr(incoming));
    }
}
