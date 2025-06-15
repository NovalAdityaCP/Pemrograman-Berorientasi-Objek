package Inheritance;
public class Buku extends Koleksi {
    String penulis;
    public Buku (String judul, String penerbit, int tahun, String penulis){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }
    @Override
    public String toString() {
        return super.toString() + ", penulis = " + penulis;
    }

    
}
