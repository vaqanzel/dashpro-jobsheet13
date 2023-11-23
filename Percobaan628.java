import java.util.Scanner;

public class Percobaan628 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menghitung luas persegi panjang
        System.out.println("Masukkan panjang persegi panjang:");
        double panjang = input.nextDouble();
        System.out.println("Masukkan lebar persegi panjang:");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);

        // Menghitung volume balok
        System.out.println("\nMasukkan panjang balok:");
        double panjangBalok = input.nextDouble();
        System.out.println("Masukkan lebar balok:");
        double lebarBalok = input.nextDouble();
        System.out.println("Masukkan tinggi balok:");
        double tinggiBalok = input.nextDouble();

        double volume = panjangBalok * lebarBalok * tinggiBalok;
        System.out.println("Volume balok: " + volume);

        input.close();
    }
}

