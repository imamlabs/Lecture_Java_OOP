
class Mahasiswa { // Kelas Mahasiswa terenkapsulasi
    private String nim; // Field nim disembunyikan (private)
    private String nama; // Field nama disembunyikan (private)

    public String getNim() { return nim; } // Getter nim
    public String getNama() { return nama; } // Getter nama

    public void setNim(String nim) { // Setter nim dengan validasi
        if (nim == null || nim.trim().isEmpty()) { // Cek nim tidak kosong
            throw new IllegalArgumentException("NIM tidak boleh kosong"); // Lempar exception jika tidak valid
        } // Tutup if
        this.nim = nim; // Set field nim
    } // Tutup setter nim

    public void setNama(String nama) { // Setter nama dengan validasi
        if (nama == null || nama.trim().length() < 2) { // Minimal 2 karakter
            throw new IllegalArgumentException("Nama minimal 2 karakter"); // Lempar exception jika tidak valid
        } // Tutup if
        this.nama = nama; // Set field nama
    } // Tutup setter nama

    public void info() { // Method menampilkan info
        System.out.println(nim + " - " + nama); // Cetak nim - nama
    } // Tutup method info
} // Tutup class Mahasiswa
