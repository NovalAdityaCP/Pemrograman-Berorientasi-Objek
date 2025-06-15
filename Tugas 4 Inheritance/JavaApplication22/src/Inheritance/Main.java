package Inheritance;
public class Main {
 
public static void main(String[] args) {
Koleksi koleksi1 = new Koleksi("Pemahaman Inheritance", "Adit", 2025);
    System.out.println(koleksi1.toString());

Buku koleksi2 = new Buku("Pemahaman Pewarisan", "Adit", 2025, "Noval");
    System.out.println(koleksi2.toString());

Majalah koleksi3 = new Majalah("Pemahaman Waris", "Adit", 2025, "2");
    System.out.println(koleksi3.toString());
    
Skripsi koleksi4 = new Skripsi ("Pemahaman Ahli Waris", "Adit", 2025, "Noval", "23081010173");
    System.out.println(koleksi4.toString());
    }
}
