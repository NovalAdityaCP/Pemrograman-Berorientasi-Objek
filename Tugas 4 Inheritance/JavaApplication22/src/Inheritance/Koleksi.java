package Inheritance;
public class Koleksi {
String judul;
String penerbit;
int tahun;
 
Koleksi (String judul, String penerbit, int tahun){
    this.judul = judul;
    this.penerbit = penerbit;
    this.tahun =  tahun;
}

@Override
public String toString() {
        return "Koleksi : " +
                "judul = " + judul  + ", penerbit = " + penerbit + ", tahun = " + tahun;
    }
}

