
class Mahasiswa { // Kelas Mahasiswa
    private static int COUNTER = 0; // Variabel statik hitung objek
    public static final String KAMPUS = "Universitas Contoh"; // Konstanta nama kampus

    private String nama; // Nama mahasiswa
    private Jurusan jurusan; // Jurusan bertipe enum

    public Mahasiswa(String nama, Jurusan jurusan) { // Constructor
        this.nama = nama; // Isi nama
        this.jurusan = jurusan; // Isi jurusan
        COUNTER++; // Tambah hitungan objek
    } // Tutup constructor

    public static int getTotal() { return COUNTER; } // Ambil total objek

    public void info() { // Cetak info mahasiswa
        System.out.println(nama + " - " + jurusan + " @ " + KAMPUS); // Cetak nama, jurusan, kampus
    } // Tutup method info
} // Tutup class Mahasiswa
