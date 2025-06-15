package Inheritance;
public class Skripsi extends Buku {
 String NPM;
    public Skripsi (String judul, String penerbit, int tahun, String penulis, String NPM){
        super(judul, penerbit, tahun, penulis);
        this.NPM = NPM;
    }
    @Override
    public String toString() {
        return super.toString() + ", NPM = " + NPM;
    }   
}
