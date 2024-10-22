package zakat2;

import java.util.Scanner;

public class Zakat2 {

    public static void main(String[] args) {
        
        System.out.println("===================================================");
        System.out.println("SELAMAT DATANG DI KALKULATOR PENGHITUNG ZAKAT MAAL");
        System.out.println("===================================================");
        
        Scanner input = new Scanner(System.in);
        String ulang;
        
        //Perulangan do-while
        do {
            
            System.out.println("Masukkan Nama Anda :");
            String nama = input.nextLine();
            
            
            System.out.println("Masukkan jumlah harta (uang) yang dimiliki: ");
            double harta = input.nextDouble();
            input.nextLine();
            
            // Kondisi apakah harta sudah mencapai nisab (misalnya 85 gram emas dengan harga 1 gram Rp 1.000.000)
            double hargaEmasPerGram = 1000000;
            double nisab = 85 * hargaEmasPerGram;
            
            //Conditional statement if
            if (harta >= nisab) {
                double totalzakat = harta * 2.5 / 100;
                System.out.printf("Halo %s, Jumlah zakat maal yang harus dibayar: Rp %.2f\n", nama, totalzakat);
            } else {
                System.out.printf("Halo %s, harta Anda belum mencapai nisab. Anda tidak wajib membayar zakat maal.\n", nama);
            }
            
            System.out.println("===================================================");
            System.out.println("Apakah Anda ingin menghitung zakat lagi? (y/n)");
            ulang = input.nextLine();
            
        } while (ulang.equalsIgnoreCase("y"));
        
        System.out.println("===================================================");
        System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM KAMI");
        System.out.println("===================================================");
    }
}
