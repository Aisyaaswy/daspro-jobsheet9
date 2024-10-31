import java.util.Scanner;
public class SearchNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNilai = new int [30];
        int hasil = 0;
        int key = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : " );
        int jmlhNilai = sc.nextInt();

        int[] nilaiMhs = new int[jmlhNilai];
        for (int i = 0; i < jmlhNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : " );
        key = sc.nextInt();

        for (int i = 0; i < jmlhNilai; i++) {
            if (nilaiMhs[i] == key) {
                hasil = i + 1;
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                break;
            }
        } 
        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
    }
}