import java.util.Scanner;

public class Kubus28 {
    private double sisi;

    public Kubus28(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = scanner.nextDouble();

        Kubus28 kubus = new Kubus28(sisiKubus);

        double volume = kubus.hitungVolume();
        System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volume);

        double luasPermukaan = kubus.hitungLuasPermukaan();
        System.out.println("Luas permukaan kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaan);

        scanner.close();
    }
}
