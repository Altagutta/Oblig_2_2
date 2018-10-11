//  <FREDRIK>
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class BSTTest <E>{
    static BST<Integer> PerfectBST;
    @Before
    public void initTree() {
        PerfectBST = new BST<>(new Integer[]{10, 5, 12, 7, 3, 20, 11});
    }
    @Test
    public void isPerfectMethod(){
        assertEquals(true, PerfectBST.isPerfect());
    }
    @Test
    public void countNodesMethod(){
        assertEquals(7, PerfectBST.countNodes());
    }
    @Test
    public void countHeightMethod(){
        assertEquals(3, PerfectBST.height());
    }
    @Test
    public void getNoOfLeavesMethod(){
        assertEquals(4, PerfectBST.getNoOfLeaves());
    }
    @Test
    public void getNoOfNonLeavesMethod(){
        assertEquals(3, PerfectBST.getNoOfNonLeaves());
    }
    @Test
    public void inorderIterativeMethod(){
        ArrayList<Integer> actual = PerfectBST.inorderIterative();
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 10, 11, 12, 20));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
//  </FREDRIK>