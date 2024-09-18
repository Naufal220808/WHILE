package Perulangan;

import java.util.Scanner;

public class PembelianAlatTulis {
    public static void main(String[] args) {
        int pilihan,jumlah=0;
        double harga=0,total,temp=0;
        String tambahBeli;
        do {
        Scanner s = new Scanner(System.in);
        System.out.println("List Alat Tulis");
        System.out.println("1. Buku 4000\n2. Pensil 2500\n3. Penghapus 1000\n4. Penggaris 2500");
        System.out.println("Inputkan Yang Ingin Dibeli: (1/2/3/4)");
        pilihan = s.nextInt();
        System.out.println("Jumlah Beli");
        jumlah= s.nextInt();

        switch (pilihan) {
            case 1:
                harga=4000;
                break;
            case 2:
                harga=2500;
                break;
            case 3:
                harga=1000;
                break;
            case 4:
                harga=2500;
                break;
        
            default:
                break;
        }

        total=jumlah*harga;
        temp += total;

        System.out.println("Apakah ingin beli? (ya/tidak)");
        tambahBeli = s.next();
    } while (tambahBeli.equalsIgnoreCase("ya"));
    System.out.println("Total yang harus anda bayar "+temp);
    
    }
}
