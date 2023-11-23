import java.util.Scanner;

public class Kubus28 {
    static int[][] nilaiTugas = new int[5][7]; // Array 2D untuk menyimpan nilai tugas lima mahasiswa selama tujuh minggu

    public static void inputData() {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai tugas setiap mahasiswa per minggu
        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nilai tugas untuk " + mahasiswa[i] + " (7 nilai untuk 7 minggu):");
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = input.nextInt();
            }
        }
        input.close();
    }

    public static void tampilkanNilai() {
        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        System.out.println("Nilai Tugas Mahasiswa:");
        for (int i = 0; i < 5; i++) {
            System.out.print(mahasiswa[i] + " : ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nilaiTertinggiPerHari() {
        int[] maxNilaiPerHari = new int[7];
        String[] hari = {"Minggu ke-1", "Minggu ke-2", "Minggu ke-3", "Minggu ke-4", "Minggu ke-5", "Minggu ke-6", "Minggu ke-7"};

        for (int j = 0; j < 7; j++) {
            int max = nilaiTugas[0][j];
            for (int i = 1; i < 5; i++) {
                if (nilaiTugas[i][j] > max) {
                    max = nilaiTugas[i][j];
                }
            }
            maxNilaiPerHari[j] = max;
        }

        System.out.println("Nilai tertinggi per hari:");
        for (int i = 0; i < 7; i++) {
            System.out.println(hari[i] + " : " + maxNilaiPerHari[i]);
        }
    }

    public static void mahasiswaNilaiTertinggi() {
        int maxNilai = 0;
        String mahasiswaTertinggi = "";

        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        for (int i = 0; i < 5; i++) {
            int nilaiTotal = 0;
            for (int j = 0; j < 7; j++) {
                nilaiTotal += nilaiTugas[i][j];
            }
            if (nilaiTotal > maxNilai) {
                maxNilai = nilaiTotal;
                mahasiswaTertinggi = mahasiswa[i];
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " + mahasiswaTertinggi + " dengan nilai total " + maxNilai);
    }

    public static void main(String[] args) {
        inputData();
        tampilkanNilai();
        nilaiTertinggiPerHari();
        mahasiswaNilaiTertinggi();
    }
}
