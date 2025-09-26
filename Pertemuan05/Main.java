
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        Person p = new Person("Andi","Tangerang"); // Buat objek Person
        Dosen d = new Dosen("Imam","Jakarta","1234567890"); // Buat objek Dosen
        p.perkenalan(); // Panggil perkenalan Person
        d.perkenalan(); // Panggil perkenalan Dosen (override)
    } // Tutup method main
} // Tutup class Main
