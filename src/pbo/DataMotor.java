package pbo;

import java.util.Scanner;

public class DataMotor {
    private MotorBalap[] motorList; // Array
    private int jumlah;

    public DataMotor(int kapasitas) {
        motorList = new MotorBalap[kapasitas];
        jumlah = 0;
    }

    // Untuk menambahkan data motor
    public void tambahMotor(MotorBalap motor) {
        if (jumlah < motorList.length) {
            motorList[jumlah] = motor;
            jumlah++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    // Untuk menampilkan semua data motor
    public void tampilkanSemua() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Motor ke-" + (i + 1));
            motorList[i].tampilInfo();
        }
    }

    // Untuk mencari data motor
    public void cariMotor(String merek) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (motorList[i].getMerek().equalsIgnoreCase(merek)) {
                System.out.println("Motor ditemukan:");
                motorList[i].tampilInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Motor dengan merek tersebut tidak ditemukan.");
        }
    }
}