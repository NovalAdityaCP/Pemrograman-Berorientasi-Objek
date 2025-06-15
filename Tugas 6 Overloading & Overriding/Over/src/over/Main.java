package Over;
class HewanLaut {
    String nama;
    
    public HewanLaut(String nama) {
        this.nama = nama;
    }
    
    public void Display() {
        System.out.println("Hewan Laut: " + nama);
    }
    
    public void berenang() {
        System.out.println(nama + " sedang berenang di lautan.");
    }
    
    public void berenang(int kecepatan) {
        System.out.println(nama + " berenang di laut dengan kecepatan " + kecepatan + " km/jam.");
    }
}

class Ikan extends HewanLaut {
    int panjang;
    double berat;
    
    public Ikan(String nama, int panjang, double berat) {
        super(nama);
        this.panjang = panjang;
        this.berat = berat;
    }
    
    @Override
    public void Display() {
        System.out.println("Ikan: " + nama + ", Panjang: " + panjang + " cm, Berat: " + berat + " kg");
    }
    
    public void berenang(String anggota_tubuh) {
        System.out.println(nama + " berenang dengan " + anggota_tubuh + "nya.");
    }
}

class IkanHiu extends Ikan {
    String bentukGigi;
    
    public IkanHiu(String nama, int panjang, double berat, String bentukGigi) {
        super(nama, panjang, berat);
        this.bentukGigi = bentukGigi;
    }

    @Override
    public void Display() {
        System.out.println("Ikan Hiu: " + nama + ", Panjang: " + panjang + " m, Berat: " + berat + " kg, dengan gigi berbentuk " + bentukGigi);
    }

    public void kegiatan(String kegiatan) {
        System.out.println("dan " + nama + " sedang " + kegiatan  + " Ikan kecil.");
    }
}

// Kelas Main untuk Menjalankan Program
public class Main {
    public static void main(String[] args) {
        HewanLaut hewan = new HewanLaut("Ubur-ubur");
        Ikan ikan = new Ikan("Ikan Badut ", 30, 1.5);
        IkanHiu hiu = new IkanHiu("Megalodon", 200, 2500.0, "Tajam dan Runcing");
        
        System.out.println("=== Hewan Laut ===");
        hewan.Display();
        hewan.berenang();
        hewan.berenang(10);
        
        System.out.println("\n=== Ikan ===");
        ikan.Display();
        ikan.berenang();
        ikan.berenang("sirip");
        
        System.out.println("\n=== Ikan Hiu ===");
        hiu.Display();
        hiu.berenang();
        hiu.kegiatan("berburu");
    }
}
