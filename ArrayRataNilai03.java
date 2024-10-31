import java.util.Scanner;
public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlhMhs = 0;
        int mhsLulus = 0;
        int mhsTidakLulus = 0;
        double jmlhNilaiLulus = 0; 
        double jmlhNilaiTidakLulus = 0;
        double total = 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlhMhs = sc.nextInt();
        
        int[] nilaiMhs = new int [jmlhMhs];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                jmlhNilaiLulus += nilaiMhs[i];
            }
            else {
                mhsTidakLulus++ ;
                jmlhNilaiTidakLulus += nilaiMhs[i];
            }
        }
        double rataLulus = jmlhNilaiLulus/mhsLulus;
        double rataTidakLulus = jmlhNilaiTidakLulus/mhsTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai  tidak lulus = " + rataTidakLulus);
    }
}