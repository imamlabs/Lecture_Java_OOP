
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        BangunDatar[] data = { // Array referensi BangunDatar
            new Persegi(4), // Objek persegi sisi 4
            new Segitiga(3,6), // Objek segitiga alas 3 tinggi 6
            new Persegi(7) // Objek persegi sisi 7
        }; // Tutup inisialisasi array
        for (BangunDatar b : data) { // Loop tiap elemen
            System.out.println("Luas: " + b.hitungLuas()); // Polimorfisme memanggil implementasi sesuai objek
        } // Tutup loop
    } // Tutup method main
} // Tutup class Main
