
import java.util.ArrayList; // Import ArrayList

class Perpustakaan { // Kelas Perpustakaan
    ArrayList<Buku> koleksi = new ArrayList<>(); // List buku
    ArrayList<Anggota> anggota = new ArrayList<>(); // List anggota

    void tambahBuku(Buku b) { koleksi.add(b); } // Tambahkan buku
    void tambahAnggota(Anggota a) { anggota.add(a); } // Tambahkan anggota
} // Tutup class Perpustakaan
