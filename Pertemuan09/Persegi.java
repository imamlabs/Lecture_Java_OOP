
class Persegi extends BangunDatar { // Subclass Persegi
    double sisi; // Panjang sisi
    Persegi(double sisi) { this.sisi = sisi; } // Constructor isi sisi
    double hitungLuas() { return sisi * sisi; } // Implementasi luas persegi
    double hitungKeliling() { return 4 * sisi; } // Implementasi keliling persegi
} // Tutup class Persegi
