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
    static BST<Integer> ImperfectBST;

    //private E[] input, expectedResult;

    @Before
    public void initTrees() {
        PerfectBST = new BST<>(new Integer[]{10, 5, 12, 7, 3, 20, 11});
        ImperfectBST = new BST<>(new Integer[]{10, 5, 12, 7, 3, 20, 11, 9});
    }

    /*
    public BSTTest(E[] input, E[] expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection trees() {
        return Arrays.asList(new Object[][] {
                { 10, 5, 12, 7, 3, 20, 11 }, //Perfect tree
                { 10, 5, 12, 7, 3, 20, 11, 9 }, //Imperfect tree
                { 7, 3, 2, 1, 4, 5},
                { 6, 6, 2, 1, 1, 3, 4, 5, 6},
                { 0, 1, 1, 0, 0, 2, 1, 4 }
        });
    }


    @Test
    public void isPerfectMethodMultiple(){

    }
       */
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
        ArrayList<Integer> actual = PerfectBST.inorderIterative();
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 10, 11, 12, 20));

        System.out.println(actual);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
//  </FREDRIK>