
class Dosen extends Person { // Dosen mewarisi Person
    private String nidn; // Field khusus dosen

    public Dosen(String nama, String alamat, String nidn) { // Constructor Dosen
        super(nama, alamat); // Panggil constructor Person
        this.nidn = nidn; // Isi field nidn
    } // Tutup constructor

    @Override // Menandai override method
    public void perkenalan() { // Perkenalan versi dosen
        System.out.println("Saya Dosen " + nama + " (NIDN: " + nidn + ") dari " + alamat); // Cetak perkenalan lengkap
    } // Tutup method perkenalan
} // Tutup class Dosen
