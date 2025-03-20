import java.util.Scanner;
public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input17.nextInt();
        input17.nextLine(); // Mengonsumsi newline

        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = input17.nextLine();
            System.out.print("Nama: ");
            String nama = input17.nextLine();
            System.out.print("Kelas: ");
            String kelas = input17.nextLine();
            System.out.print("IPK: ");
            double ipk = input17.nextDouble();
            input17.nextLine(); // Mengonsumsi newline

            Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubleSort();
        list.tampil();
    }
}
