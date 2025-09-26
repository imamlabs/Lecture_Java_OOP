
class AkunBank { // Kelas AkunBank
    private String nomor; // Menyimpan nomor rekening
    private double saldo; // Menyimpan saldo rekening

    public AkunBank(String nomor, double saldoAwal) { // Constructor
        this.nomor = nomor; // Isi nomor rekening
        this.saldo = Math.max(0, saldoAwal); // Isi saldo minimal 0
    } // Tutup constructor

    public void setor(double nominal) { // Menambah saldo
        if (nominal <= 0) throw new IllegalArgumentException("Nominal setor harus > 0"); // Validasi nominal
        saldo += nominal; // Tambahkan ke saldo
    } // Tutup method setor

    public void tarik(double nominal) { // Mengurangi saldo
        if (nominal <= 0) throw new IllegalArgumentException("Nominal tarik harus > 0"); // Validasi nominal
        if (nominal > saldo) throw new IllegalArgumentException("Saldo tidak cukup"); // Cek saldo cukup
        saldo -= nominal; // Kurangi saldo
    } // Tutup method tarik

    public void info() { // Menampilkan info rekening
        System.out.println("Akun " + nomor + " | Saldo: " + saldo); // Cetak nomor dan saldo
    } // Tutup method info
} // Tutup class AkunBank
