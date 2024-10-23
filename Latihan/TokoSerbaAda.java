package Latihan;

import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] kodebarang = {"a001", "a002", "a003","a004","a005"};
        String[] namabarang = {"Buku", "Pensil", "Pulpen","Penghapus","tip-ex"};
        int[] hargabarang = {3000, 4000, 5000, 3000, 5000};

        System.out.print("Masukkan jumlah item barang: ");
        int itemcount = scanner.nextInt();

        String[] kodeinput = new String[itemcount];
        int[] jumlahbeli = new int[itemcount];
        int[] totalbayarperitem = new int[itemcount];

        for (int i = 0; i < itemcount; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan kode barang: ");
            kodeinput[i] = scanner.next();
            System.out.print("Masukkan jumlah beli: ");
            jumlahbeli[i] = scanner.nextInt();

            for (int j = 0; j < kodebarang.length; j++) {
                if (kodeinput[i].equals(kodebarang[j])) {
                    totalbayarperitem[i] = jumlahbeli[i] * hargabarang[j];
                    break;
                }
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("****************************");
        System.out.printf("%-4s %-10s %-15s %-10s %-10s %-10s\n", "No", "Kode", "Nama", "Harga", "Jumlah", "Total");
        System.out.println("-------------------------------------------------------------");

        int grandTotal = 0;
        
        for (int i = 0; i < itemcount; i++) {
            for (int j = 0; j < kodebarang.length; j++) {
                if (kodeinput[i].equals(kodebarang[j])) {
                    System.out.printf("%-4d %-10s %-15s %-10d %-10d %-10d\n", (i + 1), kodebarang[j], namabarang[j], hargabarang[j], jumlahbeli[i], totalbayarperitem[i]);
                    grandTotal += totalbayarperitem[i];
                    break;
                }
            }
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total Bayar: %-10d\n", grandTotal);

        scanner.close();
    }
}
