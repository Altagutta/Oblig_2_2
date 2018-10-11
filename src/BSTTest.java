//  <FREDRIK>
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
    public void isPerfectMethod(){
        assertEquals(true, defaultIntList.isPerfect());
    }

    @Test
    public void countNodesMethod(){
        assertEquals(7, defaultIntList.countNodes());
    }
    @Test
    public void countHeightMethod(){
        assertEquals(3, defaultIntList.height());
    }
    @Test
    public void getNoOfLeavesMethod(){
        assertEquals(4, defaultIntList.getNoOfLeaves());
    }
    @Test
    public void getNoOfNonLeavesMethod(){
        assertEquals(3, defaultIntList.getNoOfNonLeaves());
    }
}
//  </FREDRIK>