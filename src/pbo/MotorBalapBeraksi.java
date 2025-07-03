package pbo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MotorBalapBeraksi {
    public static void main(String[] args) {
        // IO sederhana
        Scanner sc = new Scanner(System.in);
        DataMotor data = new DataMotor(5);

        int pilihan;
        
        // Perulangan
        do {
            System.out.println("\n=== Menu Motor Balap GP ===");
            System.out.println("1. Tambah Data Motor");
            System.out.println("2. Tampilkan Semua Motor");
            System.out.println("3. Cari Motor");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            // Error Handling
            try {
                pilihan = sc.nextInt();
                sc.nextLine();

                // Seleksi
                switch (pilihan) {
                    case 1:
                        System.out.print("Merek: ");
                        String merek = sc.nextLine();
                        System.out.print("CC: ");
                        int cc = sc.nextInt();
                        System.out.print("Top Speed (km/jam): ");
                        double speed = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Tim: ");
                        String tim = sc.nextLine();

                        // Objek
                        MotorBalap motor = new MotorBalap(merek, cc, speed, tim);
                        data.tambahMotor(motor);
                        break;

                    case 2:
                        data.tampilkanSemua();
                        break;

                    case 3:
                        System.out.print("Masukkan merek motor yang dicari: ");
                        String cari = sc.nextLine();
                        data.cariMotor(cari);
                        break;

                    case 4:
                        System.out.println("Terima kasih!");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                sc.nextLine();
                pilihan = 0;
            }
        } while (pilihan != 4);
    }
}