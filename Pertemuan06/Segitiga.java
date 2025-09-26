
class Segitiga extends BangunDatar { // Segitiga adalah turunan BangunDatar
    double alas, tinggi; // Alas dan tinggi segitiga
    Segitiga(double alas, double tinggi) { this.alas = alas; this.tinggi = tinggi; } // Constructor mengisi alas/tinggi
    @Override double hitungLuas() { return 0.5 * alas * tinggi; } // Menghitung luas segitiga
} // Tutup class Segitiga
