package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat codingBat = new CodingBat();

    @Test
    public void doubleX() {
        assertTrue(codingBat.doubleX("axxbb"));
        assertFalse(codingBat.doubleX("axaxax"));
        assertTrue(codingBat.doubleX("xxxxx"));
    }

    @Test
    public void array123() {
        assertTrue(codingBat.array123(new int[]{1,1,2,3,1}));
        assertFalse(codingBat.array123(new int[]{1,1,2,4,1}));
        assertTrue(codingBat.array123(new int[]{1,1,2,1,2,3}));
    }

    @Test
    public void countEvens() {
        assertEquals(3, codingBat.countEvens(new int[]{2,1,2,3,4}));
        assertEquals(3, codingBat.countEvens(new int[]{2,2,0}));
        assertEquals(0, codingBat.countEvens(new int[]{1,3,5}));
    }

    @Test
    public void withouEnd2() {
        assertEquals("ell", codingBat.withouEnd2("Hello"));
        assertEquals("b", codingBat.withouEnd2("abc"));
        assertEquals("", codingBat.withouEnd2(""));
    }
}