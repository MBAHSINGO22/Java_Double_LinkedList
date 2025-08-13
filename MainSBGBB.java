package PERTEMUAN12.SBGBB;

public class MainSBGBB {
    public static void main(String[] args) {
        // Membuat instance dari LinkedList
        Linkedlist list = new Linkedlist();

        // Menambahkan elemen di awal
        list.addFirst("A");
        System.out.println("Setelah addFirst(A): " + list);

        // Menambahkan elemen di akhir
        list.addLast("B");
        System.out.println("Setelah addLast(B): " + list);

        // Menambahkan elemen di awal lagi
        list.addFirst("C");
        System.out.println("Setelah addFirst(C): " + list);

        // Menambahkan elemen di akhir lagi
        list.addLast("D");
        System.out.println("Setelah addLast(D): " + list);

        // Menghapus elemen pertama
        Object removedFirst = list.removeFirst();
        System.out.println("Setelah removeFirst(): " + list + " (Removed: " + removedFirst + ")");

        // Menghapus elemen terakhir
        Object removedLast = list.removeLast();
        System.out.println("Setelah removeLast(): " + list + " (Removed: " + removedLast + ")");

        // Mencari elemen dalam list
        ListNode node = list.search("A");
        if (node != null) {
            System.out.println("Elemen 'A' ditemukan dalam list.");
        } else {
            System.out.println("Elemen 'A' tidak ditemukan dalam list.");
        }

        // Menampilkan ukuran list
        System.out.println("Ukuran list: " + list.size());

        // Memeriksa apakah list kosong
        System.out.println("Apakah list kosong? " + list.isEmpty());

        // Menambah elemen lagi untuk memastikan fungsi masih berjalan setelah beberapa operasi
        list.addFirst("E");
        System.out.println("Setelah addFirst(E): " + list);
    }
}
