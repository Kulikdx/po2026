package agh.po.lab3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void mapAB2() {
        assertEquals(Map.of("c", "cake"), codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))));
        assertEquals(Map.of("a", "aaa", "b", "bbb"), codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))));
        assertEquals(Map.of("a", "aaa", "b", "bbb", "c", "aaa"), codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))));
    }

    @Test
    public void wordCount() {
        assertEquals(Map.of("a", 2, "b", 2, "c", 1), codingBat.wordCount(new String[]{"a", "b", "a", "c", "b"}));
        assertEquals(Map.of("a", 1, "b", 1, "c", 1), codingBat.wordCount(new String[]{"c", "b", "a"}));
        assertEquals(Map.of("c", 4), codingBat.wordCount(new String[]{"c", "c", "c", "c"}));
    }
}