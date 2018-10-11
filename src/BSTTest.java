//  <FREDRIK>
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {
    static BST<Integer> PerfectBST;
    static BST<Integer> ImperfectBST;

    @Before
    public void initTrees() {
        PerfectBST = new BST<>(new Integer[]{10, 5, 12, 7, 3, 20, 11});
        ImperfectBST = new BST<>(new Integer[]{10, 5, 12, 7, 3, 20, 11, 9});
    }

    @Test
    public void isPerfectMethod(){
        assertEquals(true, PerfectBST.isPerfect());
        assertEquals(false, ImperfectBST.isPerfect());
    }

    @Test
    public void countNodesMethod(){
        assertEquals(7, PerfectBST.countNodes());
        assertEquals(8, ImperfectBST.countNodes());
    }
    @Test
    public void countHeightMethod(){
        assertEquals(3, PerfectBST.height());
        assertEquals(4, ImperfectBST.height());
    }
    @Test
    public void getNoOfLeavesMethod(){
        assertEquals(4, PerfectBST.getNoOfLeaves());
        assertEquals(4, ImperfectBST.height());
    }
    @Test
    public void getNoOfNonLeavesMethod(){
        assertEquals(3, PerfectBST.getNoOfNonLeaves());
        assertEquals(4, ImperfectBST.getNoOfNonLeaves());
    }

    @Test
    public void inorderIterativeMethod(){

    }
}
//  </FREDRIK>