
import java.util.*; // Import utilitas Java (Map, HashMap, dsb.)

class Barang { // Kelas Barang
    String kode, nama; // Kode dan nama barang
    double harga; // Harga barang
    Barang(String kode, String nama, double harga) { this.kode=kode; this.nama=nama; this.harga=harga; } // Constructor isi field
    public String toString(){ return kode + " - " + nama + " (Rp" + harga + ")"; } // Representasi string
} // Tutup class Barang

class Keranjang { // Kelas Keranjang belanja
    Map<String,Integer> items = new HashMap<>(); // Menyimpan pasangan kode→qty
    void tambah(Barang b, int qty){ // Tambah item ke keranjang
        items.put(b.kode, items.getOrDefault(b.kode,0)+qty); // Tambahkan qty untuk kode barang
    } // Tutup method tambah
    double total(Map<String,Barang> katalog){ // Hitung total harga
        double sum=0; // Variabel akumulasi
        for (Map.Entry<String,Integer> e: items.entrySet()){ // Iterasi tiap entri
            Barang b = katalog.get(e.getKey()); // Ambil barang dari katalog
            sum += b.harga * e.getValue(); // Tambah subtotal (harga*qty)
        } // Tutup loop
        return sum; // Kembalikan total
    } // Tutup method total
} // Tutup class Keranjang

public class App { // Kelas App
    public static void main(String[] args) { // Titik masuk
        Map<String,Barang> katalog = new HashMap<>(); // Buat katalog barang
        katalog.put("P01", new Barang("P01","Pulpen", 3000)); // Tambah Pulpen
        katalog.put("B02", new Barang("B02","Buku Tulis", 7000)); // Tambah Buku Tulis
        katalog.put("R03", new Barang("R03","Rautan", 2000)); // Tambah Rautan

        Keranjang k = new Keranjang(); // Buat keranjang
        k.tambah(katalog.get("P01"), 2); // Masukkan 2 Pulpen
        k.tambah(katalog.get("B02"), 1); // Masukkan 1 Buku Tulis
        System.out.println("Total belanja: Rp" + k.total(katalog)); // Cetak total belanja
    } // Tutup method main
} // Tutup class App
