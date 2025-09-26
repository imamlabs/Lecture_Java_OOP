
class Mahasiswa { // Kelas Mahasiswa sebagai blueprint objek
    String nim; // Menyimpan nomor induk mahasiswa
    String nama; // Menyimpan nama mahasiswa
    String jurusan; // Menyimpan jurusan mahasiswa

    void belajar(String materi) { // Method untuk menampilkan aktivitas belajar
        System.out.println(nama + " sedang belajar " + materi); // Cetak info belajar
    } // Tutup method belajar

    void tampilkanInfo() { // Method untuk menampilkan info mahasiswa
        System.out.println("NIM     : " + nim); // Cetak NIM
        System.out.println("Nama    : " + nama); // Cetak nama
        System.out.println("Jurusan : " + jurusan); // Cetak jurusan
    } // Tutup method tampilkanInfo
} // Tutup class Mahasiswa
