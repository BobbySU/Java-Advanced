package LinkedListTraversal09;

import java.util.Iterator;

public class LinkedList implements Iterable<Integer> {
    private Node first;
    private Node end;
    private int size = 0;

    private class Node {
        private Integer element;
        private Node next;
        private Node previous;

        private Node(int value) {
            this.element = value;
            this.next = null;
            this.previous = end;

            end = this;
            if (size == 0) {
                first = this;
            }

            if (this.previous != null) {
                this.previous.next = this;
            }
            size++;
        }
    }

    void add(int value) {
        new Node(value);
    }

    boolean remove(int value) {
        Node node = this.first;

        while (node != null) {
            if (node.element == value) {
                if (node.previous == null) {
                    this.first = node.next;
                } else {
                    node.previous.next = node.next;
                }
                if (node.next == null) {
                    this.end = node.previous;
                } else {
                    node.next.previous = node.previous;
                }
                node = null;
                this.size--;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    int getSize() {
        return this.size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            Node node = first;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Integer next() {
                int result = node.element;
                node = node.next;
                return result;
            }
        };
    }
}
