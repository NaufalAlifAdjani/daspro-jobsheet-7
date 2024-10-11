import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis,durasi,total;

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 keluar) : ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Anda keluar, silahkan masuk lagi.");
                break;
            }

            if(jenis == 1 || jenis == 2){
                System.out.print("Masukkan durasi (dalam jam) : ");
                durasi = sc.nextInt();

                if(durasi>5) {
                    total = 125000;
                    System.out.println("Biaya parkir anda : "+total);
                }else {
                    if (jenis == 1) {
                        total = durasi*3000;
                        System.out.println("Biaya parkir anda : "+total);
                    }else if (jenis == 2) {
                        total = durasi*2000;
                        System.out.println("Biaya parkir anda : "+total);
                    }
                }
            
            }
            System.out.println("");
        } while (true);
    }
}