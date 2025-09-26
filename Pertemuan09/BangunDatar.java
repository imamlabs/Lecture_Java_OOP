
abstract class BangunDatar { // Kelas abstrak sebagai kontrak umum
    abstract double hitungLuas(); // Harus diimplementasikan subclass
    abstract double hitungKeliling(); // Harus diimplementasikan subclass

    public void info() { // Method konkrit untuk menampilkan hasil
        System.out.println("Luas: " + hitungLuas()); // Cetak luas
        System.out.println("Keliling: " + hitungKeliling()); // Cetak keliling
    } // Tutup method info
} // Tutup class BangunDatar
