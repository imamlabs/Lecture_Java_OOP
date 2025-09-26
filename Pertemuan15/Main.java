
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        Perpustakaan lib = new Perpustakaan(); // Buat perpustakaan
        lib.tambahBuku(new Buku("B001","Java Dasar","Andi")); // Tambah buku 1
        lib.tambahBuku(new Buku("B002","Struktur Data","Budi")); // Tambah buku 2
        lib.tambahAnggota(new Anggota("AG01","Rina")); // Tambah anggota 1
        lib.tambahAnggota(new Anggota("AG02","Tono")); // Tambah anggota 2

        lib.tampilkan(); // Tampilkan awal
        System.out.println("-- Pinjam B001 -- " + (lib.pinjam("B001") ? "Sukses" : "Gagal")); // Uji pinjam
        lib.tampilkan(); // Tampilkan setelah pinjam
        System.out.println("-- Kembali B001 -- " + (lib.kembali("B001") ? "Sukses" : "Gagal")); // Uji kembali
        lib.tampilkan(); // Tampilkan setelah kembali
    } // Tutup method main
} // Tutup class Main
