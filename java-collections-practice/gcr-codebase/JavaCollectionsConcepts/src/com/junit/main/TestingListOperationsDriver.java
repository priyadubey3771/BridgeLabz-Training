package com.junit.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import com.junit.testing.TestingListOperations;

public class TestingListOperationsDriver
{
    TestingListOperations lm = new TestingListOperations();

    @Test
    void testAddElement()
    {
        List<Integer> list = new ArrayList<>();
        lm.addElement(list, 10);

        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement()
    {
        List<Integer> list = new ArrayList<>();
        list.add(20);

        lm.removeElement(list, 20);

        assertFalse(list.contains(20));
    }

    @Test
    void testGetSize()
    {
        List<Integer> list = new ArrayList<>();
        lm.addElement(list, 5);
        lm.addElement(list, 15);

        assertEquals(2, lm.getSize(list));
    }
}
