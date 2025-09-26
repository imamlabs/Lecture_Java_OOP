
class Persegi extends BangunDatar { // Persegi adalah turunan BangunDatar
    double sisi; // Panjang sisi persegi
    Persegi(double sisi) { this.sisi = sisi; } // Constructor mengisi sisi
    @Override double hitungLuas() { return sisi * sisi; } // Menghitung luas persegi
} // Tutup class Persegi
