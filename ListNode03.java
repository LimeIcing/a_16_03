public class ListNode03 {
    public int data; // data stored in this node
    public ListNode03 next; // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode03() {
        this(0, null);
    }

     // post: constructs a node with given data and null link
    public ListNode03(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode03(int data, ListNode03 next) {
        this.data = data;
        this.next = next;
    }
}