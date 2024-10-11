import java.util.Scanner;

public class SiakadFor16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi =0, terendah =100;
        int jml_lulus = 0, jml_tdklulus = 0;

        for(int i = 1; i<=10; i++){
            System.out.print("Masukkan nilai mahasiswa ke "+i+" : ");
            nilai=sc.nextDouble();

            if (nilai>tertinggi) {
                tertinggi=nilai;
            }
            if (nilai<terendah) {
                terendah=nilai;
            }
            if (nilai >= 60) {
                jml_lulus++;
            }else{
                jml_tdklulus++;
            }
        }
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
        System.out.println("Jumlah siswa lulus: "+jml_lulus);
        System.out.println("Jumlah siswa tidak lulus: "+jml_tdklulus);
    }
}