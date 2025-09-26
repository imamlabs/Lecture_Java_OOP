
class Mahasiswa { // Kelas Mahasiswa
    private String nim; // Field nim bersifat private
    private String nama; // Field nama bersifat private
    private String jurusan; // Field jurusan bersifat private

    Mahasiswa() { // Constructor tanpa parameter
        this("","Tanpa Nama","-"); // Memanggil constructor lain dengan nilai default
    } // Tutup constructor

    Mahasiswa(String nim, String nama, String jurusan) { // Constructor berparameter
        this.nim = nim; // Isi field nim
        this.nama = nama; // Isi field nama
        this.jurusan = jurusan; // Isi field jurusan
    } // Tutup constructor

    void info() { // Method menampilkan informasi singkat
        System.out.printf("(%s) %s - %s%n", nim, nama, jurusan); // Cetak format (nim) nama - jurusan
    } // Tutup method info
} // Tutup class Mahasiswa
