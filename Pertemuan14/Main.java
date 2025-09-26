
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        Perpustakaan lib = new Perpustakaan(); // Buat perpustakaan
        lib.tambahBuku(new Buku("ISBN001","Pemrograman Java","Andi")); // Tambah buku
        lib.tambahAnggota(new Anggota("A01","Siti")); // Tambah anggota
        System.out.println("Draft struktur proyek akhir dibuat."); // Info selesai
    } // Tutup method main
} // Tutup class Main
