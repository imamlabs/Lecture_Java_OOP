
public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        IMovable m1 = new Mobil(); // Variabel interface menunjuk Mobil
        IMovable m2 = new Robot(); // Variabel interface menunjuk Robot
        m1.move(); // Panggil move pada Mobil
        m2.move(); // Panggil move pada Robot
    } // Tutup method main
} // Tutup class Main
