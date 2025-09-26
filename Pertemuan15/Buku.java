
class Buku { // Kelas Buku
    String isbn, judul, penulis; // Data buku
    boolean dipinjam = false; // Status pinjam

    Buku(String isbn, String judul, String penulis) { // Constructor
        this.isbn = isbn; this.judul = judul; this.penulis = penulis; // Isi field
    } // Tutup constructor

    public String toString() { // Representasi string
        return "[" + isbn + "] " + judul + " - " + penulis + (dipinjam ? " (Dipinjam)" : ""); // Susun teks
    } // Tutup toString
} // Tutup class Buku
