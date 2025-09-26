
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        Mahasiswa a = new Mahasiswa(); // Buat objek a pakai constructor default
        Mahasiswa b = new Mahasiswa("2310001","Rina","Informatika"); // Buat objek b dengan data awal

        a.info(); // Cetak info a
        b.info(); // Cetak info b
    } // Tutup method main
} // Tutup class Main
