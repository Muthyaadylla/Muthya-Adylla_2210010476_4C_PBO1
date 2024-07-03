# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi toko handphone menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pembeli, kode pembeli, harga, dan memberikan output berupa informasi detail tersebut dari Merk hp, Warna hp, memo hp.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Handphone`, `HandphoneDetail`, dan `HandphoneBeraksi` adalah contoh dari class.

```bash
public class Handphone {
    // Atribut dan Encapsulation
    private String namapembeli;
    private String kodepembeli;
    private int harga;

    // Constructor
    public Handphone(String namapembeli, String kodepembeli, int harga) {
        this.namapembeli = namapembeli;
        this.kodepembeli = kodepembeli;
        this.harga = harga;
    }

    // Mutator (Setter)
    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void setKodepembeli(String kodepembeli) {
        this.kodepembeli = kodepembeli;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Accessor (Getter)
    public String getNamapembeli() {
        return namapembeli;
    }

    public String getKodepembeli() {
        return kodepembeli;
    }

    public int getHarga() {
        return harga;
    }

    public String info() {
        return "Nama Pembeli: " + getNamapembeli() +
                "\nKode Pembeli: " + getKodepembeli() +
                "\nHarga: " + getHarga();
    }

    // Polymorphism (Overloading)
    public String info(String ram) {
        return info() + "\nRam: " + ram;
    }
}
    ...
// Inheritance
public class HandphoneDetail extends Handphone {
    // Overriding constructor
    public HandphoneDetail(String namapembeli, String kodepembeli, int harga) {
        super(namapembeli, kodepembeli, harga);
    }
public String getMerkHp(){
    String kodeMerk = getKodepembeli().substring(0,1);
        //Seleksi If
        return switch (kodeMerk) {
            case "5" -> "Vivo";
            case "6" -> "Iphone";
            case "7" -> "Samsung";
            case "8" -> "Oppo";
            default -> "Merk Tidak Ada";
        };
    }
public String getWarnaHp(){
    String kodewarna = getKodepembeli().substring(1,3);
        //Seleksi Switch
        return switch (kodewarna) {
            case "05" -> "Hitam";
            case "06" -> "Putih";
            case "07" -> "Silver";
            case "09" -> "Gold";
            case "08" -> "Blue";
            case "10" -> "Grey";
            default -> "Warna Tidak Ada";
        };
}

public String getMemo(){
    String kodememo = getKodepembeli().substring(3,6);
        return switch (kodememo) {
            case "005" -> "32 GB";
            case "006" -> "64 GB";
            case "007" -> "128 GB";
            case "008" -> "256 GB";
            default -> "Warna Tidak Ada";
        };
        
}
    // Polymorphism (Overriding)
    @Override
    public String info() {
        return super.info() +
                "\nMerk HP: " + getMerkHp() +
                "\nWarna HP: " + getWarnaHp() +
                "\nMemo HP: " + getMemo();
    }
}
    ...
import java.util.Scanner;

public class HandphoneBeraksi {

    private static Object[] mhs;
    public static void main(String[] args) {
        //Objek
        //Handphone hp = new Handphone("Muthya Adylla", "505005" ,10000000);
        
        //System.out.println(hp.Info());  
        //System.out.println(hp.Info("4GB"));  
        
        //Eror Handling
            try (Scanner scanner = new Scanner(System.in)) {
                
            // Array untuk menyimpan objek HandphoneDetail
            HandphoneDetail[] hp = new HandphoneDetail[2];

            // Perulangan untuk input data
            for (int i = 0; i < hp.length; i++) {
                System.out.println("Masukkan data handphone ke-" + (i + 1) + ":");
                System.out.print("1. Masukkan Nama Pembeli: ");
                String nama = scanner.nextLine();
                System.out.print("2. Masukkan Kode Pembeli : ");
                String kode = scanner.nextLine();
                System.out.print("3. Masukkan Harga: ");
                int harga = Integer.parseInt(scanner.nextLine());

                // Objek
                hp[i] = new HandphoneDetail(nama, kode, harga);
            }

            // Pengulangan untuk menampilkan data handphone
            for (HandphoneDetail data : hp) {
                System.out.println("======================");
                System.out.println("Data Pembeli Handphone:");
                System.out.println(data.info());
            }

        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan saat memasukkan harga: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format kode pembeli: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}
    ...
```

2. **Object** adalah instance dari class. Pada kode ini,  hp[i] = new HandphoneDetail(nama, kode, harga);` adalah contoh pembuatan object.

```bash
 hp[i] = new HandphoneDetail(nama, kode, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namapembeli`, `kodepembeli` dan `harga` adalah contoh atribut.

```bash
String namapembeli;
String kodepembeli;
int harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Handphone`, `HandphoneDetail`.

```bash
public Handphone(String namapembeli, String kodepembeli, int harga) {
        this.namapembeli = namapembeli;
        this.kodepembeli = kodepembeli;
        this.harga = harga;}

 public HandphoneDetail(String namapembeli, String kodepembeli, int harga) {
        super(namapembeli, kodepembeli, harga);}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamapembeli`, `setKodepembeli` dan `setHarga` adalah contoh method mutator.

```bash
public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void setKodepembeli(String kodepembeli) {
        this.kodepembeli = kodepembeli;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamapembeli`, `getKodepembeli`, `getHarga` adalah contoh method accessor.

```bash
    public String getNamapembeli() {
        return namapembeli;
    }

    public String getKodepembeli() {
        return kodepembeli;
    }

    public int getHarga() {
        return harga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namapembeli`, `kodepembeli` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namapembeli;
private String kodepembeli;
private int harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `HandponeDetail` mewarisi `Handphone` dengan sintaks `extends`.

```bash
public class HandphoneDetail extends Handphone {
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `info(String ram)` di `Handphone` merupakan overloading method `Info` dan `Info` di `HandphoneDetail` merupakan override dari method `info` di `Handphone`.

```bash
 public String info(String ram) {
        return info() + "\nRam: " + ram;
}

public String info() {
        return super.info() +
                "\nMerk HP: " + getMerkHp() +
                "\nWarna HP: " + getWarnaHp() +
                "\nMemo HP: " + getMemo();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getMerkHp` dan seleksi `switch` dalam method `getWarnaHp` dan `getMemo`.

```bash
public String getMerkHp(){
    String kodeMerk = getKodepembeli().substring(0,1);
        //Seleksi If
        return switch (kodeMerk) {
            case "5" -> "Vivo";
            case "6" -> "Iphone";
            case "7" -> "Samsung";
            case "8" -> "Oppo";
            default -> "Merk Tidak Ada";
        };
    }
public String getWarnaHp(){
    String kodewarna = getKodepembeli().substring(1,3);
        //Seleksi Switch
        return switch (kodewarna) {
            case "05" -> "Hitam";
            case "06" -> "Putih";
            case "07" -> "Silver";
            case "09" -> "Gold";
            case "08" -> "Blue";
            case "10" -> "Grey";
            default -> "Warna Tidak Ada";
        };
}

public String getMemo(){
    String kodememo = getKodepembeli().substring(3,6);
        return switch (kodememo) {
            case "005" -> "32 GB";
            case "006" -> "64 GB";
            case "007" -> "128 GB";
            case "008" -> "256 GB";
            default -> "Memo Tidak Ada";
        };
        
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < hp.length; i++) {
                System.out.println("Masukkan data handphone ke-" + (i + 1) + ":");
                System.out.print("1. Masukkan Nama Pembeli: ");
                String nama = scanner.nextLine();
                System.out.print("2. Masukkan Kode Pembeli : ");
                String kode = scanner.nextLine();
                System.out.print("3. Masukkan Harga: ");
                int harga = Integer.parseInt(scanner.nextLine());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan data handphone ke-" + (i + 1) + ":");
                System.out.print("1. Masukkan Nama Pembeli: ");
                String nama = scanner.nextLine();
                System.out.print("2. Masukkan Kode Pembeli : ");
                String kode = scanner.nextLine();
                System.out.print("3. Masukkan Harga: ");
                int harga = Integer.parseInt(scanner.nextLine());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `HandphoneDetail[] hp = new HandphoneDetail[2];` adalah contoh penggunaan array.

```bash
HandphoneDetail[] hp = new HandphoneDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try (Scanner scanner = new Scanner(System.in)) {
                
            // Array untuk menyimpan objek HandphoneDetail
            HandphoneDetail[] hp = new HandphoneDetail[2];

            // Perulangan untuk input data
            for (int i = 0; i < hp.length; i++) {
                System.out.println("Masukkan data handphone ke-" + (i + 1) + ":");
                System.out.print("1. Masukkan Nama Pembeli: ");
                String nama = scanner.nextLine();
                System.out.print("2. Masukkan Kode Pembeli : ");
                String kode = scanner.nextLine();
                System.out.print("3. Masukkan Harga: ");
                int harga = Integer.parseInt(scanner.nextLine());

                // Objek
                hp[i] = new HandphoneDetail(nama, kode, harga);
            }

            // Pengulangan untuk menampilkan data handphone
            for (HandphoneDetail data : hp) {
                System.out.println("======================");
                System.out.println("Data Pembeli Handphone:");
                System.out.println(data.info());
            }

        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan saat memasukkan harga: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format kode pembeli: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
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

Nama: Muthya Adylla
NPM: 2210010476
