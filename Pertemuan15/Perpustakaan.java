
import java.util.ArrayList; // Import ArrayList

class Perpustakaan { // Kelas Perpustakaan
    ArrayList<Buku> koleksi = new ArrayList<>(); // List buku
    ArrayList<Anggota> anggota = new ArrayList<>(); // List anggota

    void tambahBuku(Buku b) { koleksi.add(b); } // Tambah buku
    void tambahAnggota(Anggota a) { anggota.add(a); } // Tambah anggota

    boolean pinjam(String isbn) { // Pinjam buku
        for (Buku b : koleksi) { // Loop semua buku
            if (b.isbn.equals(isbn) && !b.dipinjam) { // Jika isbn cocok & belum dipinjam
                b.dipinjam = true; // Tandai dipinjam
                return true; // Berhasil
            } // Tutup if
        } // Tutup loop
        return false; // Gagal
    } // Tutup method pinjam

    boolean kembali(String isbn) { // Kembalikan buku
        for (Buku b : koleksi) { // Loop semua buku
            if (b.isbn.equals(isbn) && b.dipinjam) { // Jika isbn cocok & sedang dipinjam
                b.dipinjam = false; // Tandai dikembalikan
                return true; // Berhasil
            } // Tutup if
        } // Tutup loop
        return false; // Gagal
    } // Tutup method kembali

    void tampilkan() { // Tampilkan data
        System.out.println("== Koleksi =="); // Header koleksi
        for (Buku b : koleksi) System.out.println(b); // Cetak setiap buku
        System.out.println("== Anggota =="); // Header anggota
        for (Anggota a : anggota) System.out.println(a); // Cetak setiap anggota
    } // Tutup method tampilkan
} // Tutup class Perpustakaan
