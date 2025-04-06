package com.bridgelabz.basic;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private ListManager manager;
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertEquals(2, list.size());
    }

    @Test
    public void testRemoveElement() {
        list.add(1);
        list.add(2);
        list.add(3);
        manager.removeElement(list, 2);
        assertFalse(list.contains(2));
        assertEquals(2, list.size());
    }

    @Test
    public void testGetSize() {
        assertEquals(0, manager.getSize(list));
        list.add(100);
        list.add(200);
        assertEquals(2, manager.getSize(list));
    }

    @Test
    public void testRemoveElementNotInList() {
        list.add(1);
        list.add(3);
        manager.removeElement(list, 2); // 2 isn't in the list
        assertEquals(2, list.size());  // Size should remain unchanged
    }
}

