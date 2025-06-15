package uts;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Item {
    private String namaitem;
    private double hargaProduksi;
    private double hargaJual;

    public Item(String namaitem, double hargaProduksi, double hargaJual) {
        this.namaitem = namaitem;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
    }

    public String getNama() {
        return namaitem;
    }

    public double getHargaProduksi(){
        return hargaProduksi;
    }
    
    public double getHargaJual() {
        return hargaJual;
    }
    }

class BaksoHalus extends Item {
    public BaksoHalus() {
        super("Bakso Halus", 2000, 3000);
    }

    public BaksoHalus(double produksi) {
        super("Bakso Halus", produksi, 3000);
    }

    public BaksoHalus(double produksi, double jual) {
        super("Bakso Halus", produksi, jual);
    }
}

class BaksoUrat extends Item {
    public BaksoUrat() {
        super("Bakso Urat", 2000, 3500);
    }

    public BaksoUrat(double produksi) {
        super("Bakso Urat", produksi, 3500);
    }

    public BaksoUrat(double produksi, double jual) {
        super("Bakso Urat", produksi, jual);
    }
}

class BaksoTelurPuyuh extends Item {
    public BaksoTelurPuyuh() {
        super("Bakso Telur Puyuh", 2000, 4000);
    }

    public BaksoTelurPuyuh(double produksi) {
        super("Bakso Telur Puyuh", produksi, 4000);
    }

    public BaksoTelurPuyuh(double produksi, double jual) {
        super("Bakso Telur Puyuh", produksi, jual);
    }
}

class Bakwan extends Item {
    public Bakwan() {
        super("Bakwan", 1000, 2000);
    }

    public Bakwan(double produksi) {
        super("Bakwan", produksi, 2000);
    }

    public Bakwan(double produksi, double jual) {
        super("Bakwan", produksi, jual);
    }
}

class Tahu extends Item {
    public Tahu() {
        super("Tahu", 500, 1000);
    }

    public Tahu(double produksi) {
        super("Tahu", produksi, 1000);
    }

    public Tahu(double produksi, double jual) {
        super("Tahu", produksi, jual);
    }
}

class MieBihun extends Item {
    public MieBihun() {
        super("Mie Bihun", 500, 1000);
    }

    public MieBihun(double produksi) {
        super("Mie Bihun", produksi, 1000);
    }

    public MieBihun(double produksi, double jual) {
        super("Mie Bihun", produksi, jual);
    }
}

class Kuah extends Item {
    public Kuah() {
        super("Kuah", 0, 0);
    }

    public Kuah(double produksi) {
        super("Kuah", produksi, 0);
    }

    public Kuah(double produksi, double jual) {
        super("Kuah", produksi, jual);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> stok = new ArrayList<>();
        ArrayList<Item> mangkok = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stok.add(new BaksoHalus());
            stok.add(new BaksoUrat());
            stok.add(new BaksoTelurPuyuh());
            stok.add(new Bakwan());
            stok.add(new Tahu());
            stok.add(new MieBihun());
        }

        System.out.println("--- MENU ---");
        System.out.println("1. Bakso Halus Rp3000");
        System.out.println("2. Bakso Urat Rp3500");
        System.out.println("3. Bakso Telur Puyuh Rp4000");
        System.out.println("4. Bakwan Rp2000");
        System.out.println("5. Tahu Rp1000");
        System.out.println("6. Mie Bihun Rp1000");
        System.out.println("7. Kuah Gratis Refill");
        System.out.println("8. Selesaikan Pembelian");

        while (true) {
            System.out.print("Pilih nomor dari menu yang ingin dibeli (ketik 8 untuk melanjutkan ke pembayaran): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 8) break;

            Item itemDipilih = null;
            switch (pilihan) {
                case 1 -> itemDipilih = new BaksoHalus();
                case 2 -> itemDipilih = new BaksoUrat();
                case 3 -> itemDipilih = new BaksoTelurPuyuh();
                case 4 -> itemDipilih = new Bakwan();
                case 5 -> itemDipilih = new Tahu();
                case 6 -> itemDipilih = new MieBihun();
                case 7 -> itemDipilih = new Kuah();
                default -> System.out.println("Pilihan tidak valid.");
            }

            if (itemDipilih != null) {
                mangkok.add(itemDipilih);
                System.out.println(itemDipilih.getNama() + " ditambahkan ke mangkuk.");
            }
        }

        System.out.println("\n--- Hasil Pembelian ---");
        double totalJual = 0;
        double totalProduksi = 0;
        for (Item item : mangkok) {
            System.out.println(item.getNama() + " = Rp" + item.getHargaJual());
            totalJual += item.getHargaJual();
            totalProduksi += item.getHargaProduksi();
        }

        System.out.println("Total Harga yang harus dibayar: Rp" + totalJual);
        System.out.println("Total Keuntungan yang didapat dari penjualan item tersebut: Rp" + (totalJual - totalProduksi));
    }
}

