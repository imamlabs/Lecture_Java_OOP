
class Person { // Kelas dasar Person
    protected String nama; // Field nama dapat diakses subclass
    protected String alamat; // Field alamat dapat diakses subclass

    public Person(String nama, String alamat) { // Constructor Person
        this.nama = nama; // Isi field nama
        this.alamat = alamat; // Isi field alamat
    } // Tutup constructor

    public void perkenalan() { // Method perkenalan umum
        System.out.println("Saya " + nama + " dari " + alamat); // Cetak perkenalan
    } // Tutup method perkenalan
} // Tutup class Person
