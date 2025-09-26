
import java.util.ArrayList; // Import ArrayList untuk daftar dinamis
import java.util.Scanner; // Import Scanner untuk input

public class Main { // Kelas Main
    public static void main(String[] args) { // Titik masuk
        ArrayList<Mahasiswa> daftar = new ArrayList<>(); // Buat list mahasiswa
        Scanner sc = new Scanner(System.in); // Buat scanner untuk input

        while (true) { // Loop menu
            System.out.println("1. Tambah  2. Hapus  3. Tampil  0. Keluar"); // Tampilkan menu
            String pilih = sc.nextLine(); // Baca pilihan
            if (pilih.equals("1")) { // Jika pilih tambah
                System.out.print("NIM: "); // Minta nim
                String nim = sc.nextLine(); // Baca nim
                System.out.print("Nama: "); // Minta nama
                String nama = sc.nextLine(); // Baca nama
                daftar.add(new Mahasiswa(nim, nama)); // Tambah objek ke list
            } else if (pilih.equals("2")) { // Jika pilih hapus
                System.out.print("Index hapus: "); // Minta index
                int idx = Integer.parseInt(sc.nextLine()); // Parse ke int
                if (idx >=0 && idx < daftar.size()) daftar.remove(idx); // Hapus jika valid
            } else if (pilih.equals("3")) { // Jika pilih tampil
                for (int i=0;i<daftar.size();i++) { // Loop tampilan
                    System.out.println(i + ". " + daftar.get(i)); // Cetak index dan data
                } // Tutup loop for
            } else if (pilih.equals("0")) break; // Keluar jika 0
        } // Tutup while
    } // Tutup method main
} // Tutup class Main
