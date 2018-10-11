import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {
    static BST<Integer> defaultIntList;

    @Before
    public void initStaticList() {
        defaultIntList = new BST<>(new Integer[]{10, 5, 12, 7, 3, 20, 11});
    }

    @Test
    public void isPerfectMethod(){}

    @Test
    public void countNodesMethod(){
        assertEquals(7, defaultIntList.countNodes());
    }
    @Test
    public void countHeightMethod(){
        assertEquals(3, defaultIntList.countHeight());
    }
    @Test
    public void getNoLeavesMethod(){
        assertEquals(4, defaultIntList.getNoLeaves());
    }
    @Test
    public void getNoOfNonLeavesMethod(){
        assertEquals(3, defaultIntList.getNoOfNonLeaaves());
    }
}
