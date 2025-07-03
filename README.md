# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merek, cc, kecepatan maks, dan tim, dan memberikan output berupa informasi detail dari motor tersebut seperti merek, cc, kecepatan maks, dan tim. Aplikasi ini bisa melakukan input data motor, menampilkan semua data motor yang diinputkan, dan mencari spesifik data motor.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Motor`, `MotorBalap`, `DataMotor` dan `MotorBalapBeraksi` adalah contoh dari class.

```bash
public class Motor {
    ...
}

public class MotorBalap extends Motor {
    ...
}

public class DataMotor {
    ...
}

public class MotorBalapBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `MotorBalap motor = new MotorBalap(merek, cc, speed, tim);` adalah contoh pembuatan object.

```bash
MotorBalap motor = new MotorBalap(merek, cc, speed, tim);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merek`, `cc`, `kecepatanMaks`, `tim` dan `jumlah` adalah contoh atribut.

```bash
String merek;
int cc;
double kecepatanMaks;

String tim;

int jumlah;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Motor` dan `MotorBalap`.

```bash
public Motor(String merek, int cc, double kecepatanMaks) {
    this.merek = merek;
    this.cc = cc;
    this.kecepatanMaks = kecepatanMaks;
}

public MotorBalap(String merek, int cc, double kecepatanMaks, String tim) {
    super(merek, cc, kecepatanMaks);
    this.tim = tim;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerek`, `setCc`, `setKecepatanMaks`, dan `setTim` adalah contoh method mutator.

```bash
public void setMerek(String merek) {
    this.merek = merek;
}

public void setCc(int cc) {
    this.cc = cc;
}

public void setKecepatanMaks(double kecepatanMaks) {
    this.kecepatanMaks = kecepatanMaks;
}

public void setTim(String tim) {
    this.tim = tim;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerek`, `getCc`, `getKecepatanMaks`,  dan `getTim` adalah contoh method accessor.

```bash
public String getMerek() {
    return merek;
}

public int getCc() {
    return cc;
}

public double getKecepatanMaks() {
    return kecepatanMaks;
}

public String getTim() {
    return tim;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merek`, `cc`, `kecepatanMaks`, `tim` dan `jumlah` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merek;
private int cc;
private double kecepatanMaks;

private String tim;

private int jumlah;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MotorBalap` mewarisi `Motor` dengan sintaks `extends`.

```bash
public class MotorBalap extends Motor {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilInfo()` di `Motor` merupakan overloading method `tampilInfo()` dan `tampilInfo()` di `MotorBalap` merupakan override dari method `tampilInfo()` di `Motor`.

```bash
public void tampilInfo() {
    System.out.println("Merek: " + merek);
    System.out.println("CC: " + cc);
    System.out.println("Top Speed: " + kecepatanMaks + " km/jam");
}

@Override
public void tampilInfo() {
    super.tampilInfo();
    System.out.println("Tim Balap: " + tim);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `pilihan`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do while` untuk meminta input dan menampilkan data.

```bash
do {
    System.out.println("\n=== Menu Motor Balap GP ===");
    System.out.println("1. Tambah Data Motor");
    System.out.println("2. Tampilkan Semua Motor");
    System.out.println("3. Cari Motor");
    System.out.println("4. Keluar");
    System.out.print("Pilih menu: ");

    ...

} while (pilihan != 4);
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner sc = new Scanner(System.in);

System.out.println("\n=== Menu Motor Balap GP ===");
System.out.println("1. Tambah Data Motor");
System.out.println("2. Tampilkan Semua Motor");
System.out.println("3. Cari Motor");
System.out.println("4. Keluar");
System.out.print("Pilih menu: ");

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
    
    case 2:
        data.tampilkanSemua();
        break;
    
    case 3:
        System.out.print("Masukkan merek motor yang dicari: ");
        String cari = sc.nextLine();
    
    case 4:
        System.out.println("Terima kasih!");
        break;
    
    default:
        System.out.println("Pilihan tidak valid!");
    }
    } catch (InputMismatchException e) {
        System.out.println("Input harus berupa angka!");
        sc.nextLine();
    }
} while (pilihan != 4);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `motorList = new MotorBalap[kapasitas];` adalah contoh penggunaan array.

```bash
motorList = new MotorBalap[kapasitas];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
}catch (InputMismatchException e) {
    System.out.println("Input harus berupa angka!");
    sc.nextLine();
    pilihan = 0;
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muliadi
NPM: 2310010070
