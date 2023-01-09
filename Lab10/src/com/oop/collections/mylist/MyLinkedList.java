package com.oop.collections.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList(MyLinkedListNode head, int size) {
        this.head = null;
        this.size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int idx) {
        MyLinkedListNode current = head;
        for (int i = 0; i < idx; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void add(Object o) {
        add(o, size);
    }

    public void add(Object o, int idx) {
        checkBoundaries(idx, size);
        if (idx == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(idx - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    public Object get(int idx) {
        try {
            checkBoundaries(idx, size - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't get at index " + idx);
        }
        return null;
    }

    public void remove(int idx) {
        try {
            checkBoundaries(idx, size - 1);
            MyLinkedListNode current = getNodeByIndex(idx - 1);
            current.setNext(current.getNext().getNext());
            size--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't remove at index " + idx);
        }
    }

    public int size() {
        return size;
    }
}
