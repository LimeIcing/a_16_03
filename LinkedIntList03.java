// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList03 {

    /*
    Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
    otherwise. An empty list is considered to be sorted.
     */

    public boolean isSorted() {
        if (front == null) {
            return false;
        }

        boolean isSorted = true;
        ListNode03 current = front;

        while (current.next != null) {
            if (current.data > current.next.data) {
                isSorted = false;
            }
            current = current.next;
        }

        return isSorted;
    }

    // Everything below is copied from the book

    private ListNode03 front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList03() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode03 current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode03 current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode03 current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode03(value);
        } else {
            ListNode03 current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode03(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode03(value, front);
        } else {
            ListNode03 current = nodeAt(index - 1);
            current.next = new ListNode03(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode03 current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode03 nodeAt(int index) {
        ListNode03 current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

}