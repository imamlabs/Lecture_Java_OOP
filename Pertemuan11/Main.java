
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        Mahasiswa a = new Mahasiswa("Ari", Jurusan.INFORMATIKA); // Buat objek a
        Mahasiswa b = new Mahasiswa("Nina", Jurusan.SISTEM_INFORMASI); // Buat objek b
        a.info(); // Cetak info a
        b.info(); // Cetak info b
        System.out.println("Total objek Mahasiswa: " + Mahasiswa.getTotal()); // Cetak total objek
    } // Tutup method main
} // Tutup class Main
