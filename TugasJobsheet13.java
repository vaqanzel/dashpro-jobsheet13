import java.util.Scanner;

public class TugasJobsheet13 {
    static int[][] nilaiTugas;
    static String[] namaMahasiswa;

    public static void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input.nextInt();

        nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai Tugas " + (j + 1) + " " + namaMahasiswa[i] + ": ");
                nilaiTugas[i][j] = input.nextInt();
            }
        }
        input.close();
    }

    public static void tampilkanNilai() {
        System.out.println("Nilai Tugas Mahasiswa:");
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inputData();
        tampilkanNilai();
    }
}
