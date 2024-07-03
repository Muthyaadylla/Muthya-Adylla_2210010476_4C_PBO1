package Pbo1;

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

