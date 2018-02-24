package Refactored;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void add() {
        MyArrayList arrayList = new MyArrayList();
        Object objectToAdd = new Object();
        int sizeBefore = arrayList.size();
        arrayList.add(objectToAdd);
        int sizeAfter = arrayList.size();

        assertThrows(NullPointerException.class, () -> {arrayList.add(null);});
        assertEquals(sizeBefore + 1, sizeAfter);
        assertEquals(arrayList.get(0), objectToAdd);
    }

    @org.junit.jupiter.api.Test
    void size() {
        MyArrayList arrayList = new MyArrayList();
        int sizeBefore = arrayList.size();
        arrayList.add(new Object());
        int sizeAfter = arrayList.size();

        assertEquals(0, sizeBefore);
        assertEquals(sizeBefore + 1, sizeAfter);
    }

    @org.junit.jupiter.api.Test
    void get() {
        MyArrayList arrayList = new MyArrayList();
        Object objectToAdd = new Object();
        arrayList.add(objectToAdd);

        assertEquals(arrayList.get(0), objectToAdd);
        assertThrows(IndexOutOfBoundsException.class, () -> {arrayList.get(-1);});
        assertThrows(IndexOutOfBoundsException.class, () -> {arrayList.get(2);});
    }

    @org.junit.jupiter.api.Test
    void addWithIndex() {
        MyArrayList arrayList = new MyArrayList();

        Object objectToAdd = new Object();
        arrayList.add(objectToAdd);

        assertEquals(arrayList.get(0), objectToAdd);
        assertThrows(IndexOutOfBoundsException.class, () -> {arrayList.add(2, new Object());});
        assertThrows(IndexOutOfBoundsException.class, () -> {arrayList.add(-1, new Object());});
    }

    @org.junit.jupiter.api.Test
    void remove() {
        MyArrayList arrayList = new MyArrayList();

        Object objectToAdd = new Object();
        arrayList.add(objectToAdd);

        assertEquals(objectToAdd, arrayList.get(0));
        assertEquals(objectToAdd, arrayList.remove(0));
        assertThrows(IndexOutOfBoundsException.class, () -> {arrayList.remove(-1);});
        assertThrows(IndexOutOfBoundsException.class, () -> {arrayList.remove(0);});
    }

}