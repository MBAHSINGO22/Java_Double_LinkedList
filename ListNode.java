package PERTEMUAN12.SBGBB;

public class ListNode {
    // Elemen dari node
    Object elemen;
    // Node selanjutnya
    ListNode next;
    // Node sebelumnya
    ListNode prev;

    // Konstruktor untuk membuat node tanpa elemen, next, dan prev
    public ListNode() {
        this(null, null, null);
    }

    // Konstruktor untuk membuat node dengan elemen tertentu dan next dan prev null
    public ListNode(Object elemen) {
        this(elemen, null, null);
    }

    // Konstruktor untuk membuat node dengan elemen, next, dan prev tertentu
    public ListNode(Object elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }
}
