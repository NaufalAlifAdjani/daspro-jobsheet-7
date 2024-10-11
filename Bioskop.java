import java.util.Scanner;
public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaTiket=50000, jmlTiket,total,totalHarga;
        int totalTiket=0, totalOmset=0;
        
        do {
            System.out.print("Masukkan jumlah tiket (Ketik 0 untuk akhiri): ");
            jmlTiket = sc.nextInt();
            totalHarga = jmlTiket*hargaTiket;
            total= (int) (totalHarga);
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            }

            if (jmlTiket==0) {
                System.out.println("Transaksi Hari ini selesai");
                System.out.println("------Berikut penjualan hari ini------");
                System.out.println("Tiket terjual : "+totalTiket);
                System.out.println("Total omset : "+totalOmset);
                break;
            }

            if (jmlTiket > 10) {
                totalHarga *= 0.85; // diskon 15%
                System.out.println("");
                System.out.println("Anda mendapatkan diskon : 15%");
            } else if (jmlTiket > 4) {
                System.out.println("");
                System.out.println("Anda mendapatkan diskon : 10%");
                totalHarga *= 0.90; // diskon 10%
            }

            System.out.println("Total harga sebelum diskon : "+total);
            System.out.println("Total harga yang harus anda bayar : "+totalHarga);
            System.out.println("");

            totalTiket += jmlTiket;
            totalOmset += totalHarga;
            System.out.println("");
        } while (true);
    }
}
