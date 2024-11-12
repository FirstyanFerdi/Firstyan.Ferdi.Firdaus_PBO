package zakat3;

import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("SELAMAT DATANG DI KALKULATOR PENGHITUNG ZAKAT MAAL");
        System.out.println("===================================================\n");

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String ulang;

        // Nilai nisab berdasarkan harga emas
        double hargaEmasPerGram = 1000000;
        double nisab = 85 * hargaEmasPerGram;

        // Daftar penerima zakat yang sudah ditentukan
        Penerima[] penerimaList = {
            new Penerima("Jojodi Narto", "JL. Pepaya No.1"),
            new Penerima("Siti Nurjanah", "JL. Anggur No.2"),
            new Penerima("Budi Santoso", "JL. Salak No.3"),
            new Penerima("Rina Suryani", "JL. Pisang No.4"),
            new Penerima("Andi Saputra", "JL. Rambutan No.5")
        };

        // Perulangan do-while
        do {
            System.out.println("Masukkan Nama Muzaki :");
            String namaMuzaki = input.nextLine();

            System.out.println("Masukkan jumlah harta (uang) yang dimiliki: ");
            double harta = input.nextDouble();
            input.nextLine();

            Muzaki muzaki = new Muzaki(namaMuzaki, harta);

            // Conditional statement if
            if (muzaki.isWajibZakat(nisab)) {
                double totalZakat = muzaki.hitungZakat();
                System.out.println("===================================================\n");
                System.out.printf("Halo %s\nJumlah zakat maal yang harus dibayar: Rp %.2f\n", muzaki.getNama(), totalZakat);
                
                // Memilih penerima zakat secara acak
                Penerima penerimaAcak = penerimaList[random.nextInt(penerimaList.length)];
                System.out.println("Berikut adalah penerima zakat yang dipilih secara acak:");
                System.out.printf("Nama\t: %s\nAlamat\t: %s\n", penerimaAcak.getNama(), penerimaAcak.getAlamat());
            } else {
                System.out.printf("Halo %s, harta Anda belum mencapai nisab. Anda tidak wajib membayar zakat maal.\n", muzaki.getNama());
            }

            System.out.println("===================================================\n");
            System.out.println("Apakah Anda ingin menghitung zakat lagi? (y/n)");
            ulang = input.nextLine();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("===================================================");
        System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM KAMI");
        System.out.println("===================================================");
    }
}

