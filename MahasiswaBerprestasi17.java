import java.util.Scanner;

public class MahasiswaBerprestasi17 {
    Mahasiswa17[] listMhs;
    int idx;

    MahasiswaBerprestasi17(int jumlah) {
        listMhs = new Mahasiswa17[jumlah];
        idx = 0;
    }

    void tambah(Mahasiswa17 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void bubleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa17 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void tampil() {
        for (Mahasiswa17 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-----------------------");
            }
        }
    }
}
