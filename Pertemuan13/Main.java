
import java.util.InputMismatchException; // Import contoh (opsional)
import java.util.Scanner; // Import Scanner untuk input

public class Main { // Kelas Main
    public static int bagi(int a, int b) throws ArithmeticException { // Method bagi; bisa lempar ArithmeticException
        return a / b; // Kembalikan hasil pembagian
    } // Tutup method bagi

    public static void main(String[] args) { // Titik masuk
        Scanner sc = new Scanner(System.in); // Buat scanner
        try { // Mulai blok try
            System.out.print("Masukkan angka pertama: "); // Minta angka 1
            int x = Integer.parseInt(sc.nextLine()); // Baca dan parse angka 1
            System.out.print("Masukkan angka kedua: "); // Minta angka 2
            int y = Integer.parseInt(sc.nextLine()); // Baca dan parse angka 2
            System.out.println("Hasil: " + bagi(x, y)); // Cetak hasil bagi
        } catch (NumberFormatException e) { // Tangkap input bukan angka
            System.out.println("Input harus berupa angka."); // Pesan kesalahan
        } catch (ArithmeticException e) { // Tangkap pembagian nol
            System.out.println("Tidak bisa membagi dengan nol."); // Pesan kesalahan
        } finally { // Blok finally
            System.out.println("Selesai."); // Notifikasi selesai
        } // Tutup finally
    } // Tutup method main
} // Tutup class Main
