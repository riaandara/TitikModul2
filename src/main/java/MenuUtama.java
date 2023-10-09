//import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class MenuUtama {
    public static void main(String[] args) {
        Titik titik = new Titik();
        Scanner masukan = new Scanner(System.in);
        System.out.println();
        int pilihan;
        //String nama;
        //System.out.println("Masukkan Nama Anda : ");
        //nama = masukan.nextLine();
        //System.out.print("Silahkan Masukkan Pilihan (1,2,3,4,5,6,0) :");
        //pilihan = masukan.nextInt();
        do {
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.println("Masukan Pilihan Anda : ");
            pilihan = masukan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("INISIALISAI TITIK");
                    System.out.println("Masukkan nilai X : ");
                    int x = masukan.nextInt();
                    System.out.println("Masukan nilai Y: ");
                    int y = masukan.nextInt();
                    titik.inisialisasiTitik(x, y);

                    break;
                case 2:
                    System.out.println("TAMPIL TITIK");
                    titik.tampilTtitik();
                    break;
                case 3:
                    System.out.println("PERKALIAN SKALAR TITIK");
                    System.out.println("Masukkan nilai skalar : ");
                    int skalar;
                    skalar = masukan.nextInt();
                    titik.perkalianSkalar(skalar);
                    break;
                case 4:
                    System.out.println("PENCERMINAN TERHADAP SUMBU X");
                    titik.pencerminanSumbuX();
                    break;
                case 5:
                    System.out.println("PENCERMINAN TERHADAP SUMBU Y");
                    titik.pencerminanSumbuY();
                    break;
                case 6:
                    System.out.println("JARAK ANTARA DUA TITIK");
                    Titik titik2 = new Titik();
                    System.out.println("Masukan nilai x titik kedua : ");
                    int x2 = masukan.nextInt();
                    System.out.println("Masukan nilai y titik kedua : ");
                    int y2 = masukan.nextInt();
                    titik2.inisialisasiTitik(x2, y2);
                    int jarak = titik.jarak(titik2);
                    System.out.println("Jarak antara dua titik : " + jarak);
                    break;
                case 0:
                    System.out.println("KELUAR");
                    break;
                default:
                    System.out.println("PILIHAN ANDA TIDAK VALID");
            }
        } while (pilihan != 0);
    }
}
