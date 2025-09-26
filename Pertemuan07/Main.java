
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        AkunBank a = new AkunBank("001", 100000); // Buat akun awal 100000
        a.setor(25000); // Setor 25000
        a.tarik(5000); // Tarik 5000
        a.info(); // Tampilkan saldo
    } // Tutup method main
} // Tutup class Main
