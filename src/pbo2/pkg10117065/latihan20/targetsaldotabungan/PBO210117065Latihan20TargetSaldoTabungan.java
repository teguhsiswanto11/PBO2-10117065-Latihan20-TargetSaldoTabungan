package pbo2.pkg10117065.latihan20.targetsaldotabungan;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menghitung pada bulan ke berapa saldo target terpenuhi 
 * dari saldo awal yang terus berbunga setiap bulannya
 * 
 */
public class PBO210117065Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
                
//        deklarasi variabel
        int i;
        int saldoAwal;
        int bunga; // persen bunga
        int jbunga; // jumlah bunga
        int saldoTarget;
        
//        variabel yang diberi value
        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        
//        proses looping sampai mencapai target
        i=1; //inisialisasi variabel i=1
        while (saldoAwal <= saldoTarget) {
            //rumus 
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;
            //menampilkan dengan format tertentu
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;//increase variabel i -> untuk mengontrol perhitungan bulan
        }
    }
}