package PERTEMUAN12.SBGBB;

public class Linkedlist {
    // Menyimpan node pertama dari linked list
    private ListNode head;
    // Menyimpan jumlah elemen dalam linked list
    private int size;

    // Konstruktor untuk menginisialisasi linked list yang kosong
    public Linkedlist() {
        head = null;
        size = 0;
    }

    // Metode untuk menambahkan node sebelum node tertentu
    private void addBefore(Object elemen, ListNode node) {
        // Jika node adalah null, keluar dari metode
        if (node == null) {
            return;
        }

        // Membuat node baru dengan elemen yang diberikan dan menghubungkannya dengan node sebelumnya dan berikutnya
        ListNode newNode = new ListNode(elemen, node, node.prev);

        // Jika node sebelumnya tidak null, hubungkan node sebelumnya dengan node baru
        if (node.prev != null) {
            node.prev.next = newNode;
        } else {
            // Jika node adalah head, perbarui head ke node baru
            head = newNode;
        }

        // Perbarui node sebelumnya dari node yang diberikan ke node baru
        node.prev = newNode;
        size++;
    }

    // Metode untuk menghapus node tertentu dan mengembalikan elemennya
    private Object remove(ListNode node) {
        // Jika node adalah null, keluar dari metode
        if (node == null) {
            return null;
        }

        // Jika node sebelumnya tidak null, hubungkan node sebelumnya dengan node berikutnya
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            // Jika node adalah head, perbarui head ke node berikutnya
            head = node.next;
        }

        // Jika node berikutnya tidak null, hubungkan node berikutnya dengan node sebelumnya
        if (node.next != null) {
            node.next.prev = node.prev;
        }

        size--;
        return node.elemen;
    }

    // Metode untuk menambahkan elemen ke awal linked list
    public void addFirst(Object elemen) {
        if (head == null) {
            head = new ListNode(elemen);
        } else {
            addBefore(elemen, head);
        }
    }

    // Metode untuk menambahkan elemen ke akhir linked list
    public void addLast(Object elemen) {
        if (head == null) {
            head = new ListNode(elemen);
        } else {
            ListNode current = head;
            // Menelusuri hingga node terakhir
            while (current.next != null) {
                current = current.next;
            }
            // Membuat node baru di akhir linked list
            current.next = new ListNode(elemen, null, current);
            size++;
        }
    }

    // Metode untuk menghapus elemen pertama dari linked list dan mengembalikannya
    public Object removeFirst() {
        if (head == null) {
            return null;
        }
        return remove(head);
    }

    // Metode untuk menghapus elemen terakhir dari linked list dan mengembalikannya
    public Object removeLast() {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        // Menelusuri hingga node terakhir
        while (current.next != null) {
            current = current.next;
        }
        return remove(current);
    }

    // Metode untuk mencari elemen dalam linked list dan mengembalikan nodenya jika ditemukan
    public ListNode search(Object elemen) {
        ListNode current = head;
        while (current != null) {
            // Memeriksa apakah node saat ini mengandung elemen
            if (current.elemen.equals(elemen)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Metode untuk mengembalikan jumlah elemen dalam linked list
    public int size() {
        return size;
    }

    // Metode untuk memeriksa apakah linked list kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Override metode toString untuk mengembalikan representasi string dari semua elemen dalam linked list
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        // Menelusuri linked list dan menambahkan setiap elemen ke string builder
        while (current != null) {
            sb.append(current.elemen).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
