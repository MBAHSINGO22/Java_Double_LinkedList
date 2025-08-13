# 📝 Java Double LinkedList

## Implementasi Double Linked List dalam Java
Proyek Java yang menunjukkan struktur data double linked list dengan operasi penambahan, penghapusan, dan pencarian.

## 📖 Deskripsi Proyek
Proyek Java yang mengimplementasikan double linked list dengan fokus pada:

- 📊 **Linkedlist.java**: Kelas utama untuk linked list dengan metode `addFirst`, `addLast`, `removeFirst`, `removeLast`, `search`, dan `toString` untuk menampilkan elemen.
- 🔍 **ListNode.java**: Kelas untuk node dengan atribut elemen, next, dan prev.
- 🛠️ **MainSBGBB.java**: Kelas utama yang menguji operasi linked list dengan menambahkan elemen ("A", "B", "C", "D"), menghapus elemen, mencari elemen, dan menampilkan status.

Proyek ini terdiri dari tiga file Java (`Linkedlist.java`, `ListNode.java`, `MainSBGBB.java`) dalam paket `PERTEMUAN12.SBGBB`. 🟢

## 🧠 Teknologi
- Java

## 📂 Struktur File
```
Java_Doubly_LinkedList/
├── src/PERTEMUAN12/SBGBB/
├── Linkedlist.java          # 📊 Implementasi kelas linked list
├── ListNode.java            # 🔍 Definisi node untuk linked list
├── MainSBGBB.java           # 🛠️ Skrip utama untuk pengujian
```

## 🟢 Catatan:
- Pastikan Anda memiliki Java Development Kit (JDK) yang terinstal.
- Linked list ini mendukung operasi dasar dengan struktur double linked untuk navigasi dua arah.
- Tidak ada dependensi eksternal; gunakan pustaka standar Java.

## 📈 Contoh Output
**MainSBGBB.java**
```
Setelah addFirst(A): A
Setelah addLast(B): A B
Setelah addFirst(C): C A B
Setelah addLast(D): C A B D
Setelah removeFirst(): A B D (Removed: C)
Setelah removeLast(): A B (Removed: D)
Elemen 'A' ditemukan dalam list.
Ukuran list: 2
Apakah list kosong? false
Setelah addFirst(E): E A B
```

## 👨‍💻 Pengembang
MBAHSINGO22  
🔗 GitHub
