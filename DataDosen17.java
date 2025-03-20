public class DataDosen17 {
    public Dosen17[] dataDosen17 = new Dosen17[10];
    public int idx = 0;

    public void tambah(Dosen17 dsn) {
        if (idx < dataDosen17.length) {
            dataDosen17[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen17[i].tampil();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen17[j].usia > dataDosen17[j + 1].usia) {
                    Dosen17 temp = dataDosen17[j];
                    dataDosen17[j] = dataDosen17[j + 1];
                    dataDosen17[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan secara ascending berdasarkan usia.");
    }

    public void sortingDSC() { 
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen17[j].usia > dataDosen17[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen17 temp = dataDosen17[maxIdx];
            dataDosen17[maxIdx] = dataDosen17[i];
            dataDosen17[i] = temp;
        }
        System.out.println("Data telah diurutkan secara descending berdasarkan usia.");
    }

    public void insertionSort() { 
        for (int i = 1; i < idx; i++) {
            Dosen17 temp = dataDosen17[i];
            int j = i - 1;
            while (j >= 0 && dataDosen17[j].usia < temp.usia) {
                dataDosen17[j + 1] = dataDosen17[j];
                j--;
            }
            dataDosen17[j + 1] = temp;
        }
        System.out.println("Data telah diurutkan menggunakan insertion sort (descending usia).");
    }
}
