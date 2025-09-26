
public class Main { // Kelas Main untuk eksekusi
    public static void main(String[] args) { // Titik masuk program
        Mahasiswa m1 = new Mahasiswa(); // Buat objek m1
        m1.nim = "2312345"; // Set NIM m1
        m1.nama = "Budi"; // Set nama m1
        m1.jurusan = "Informatika"; // Set jurusan m1

        Mahasiswa m2 = new Mahasiswa(); // Buat objek m2
        m2.nim = "2312346"; // Set NIM m2
        m2.nama = "Siti"; // Set nama m2
        m2.jurusan = "Sistem Informasi"; // Set jurusan m2

        m1.tampilkanInfo(); // Tampilkan info m1
        m1.belajar("OOP"); // Panggil method belajar pada m1
        System.out.println(); // Cetak baris kosong
        m2.tampilkanInfo(); // Tampilkan info m2
        m2.belajar("Struktur Data"); // Panggil method belajar pada m2
    } // Tutup method main
} // Tutup class Main
