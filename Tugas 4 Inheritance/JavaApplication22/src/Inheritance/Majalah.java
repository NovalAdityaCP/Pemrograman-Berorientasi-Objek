package Inheritance;
public class Majalah extends Koleksi {
    String edisi;
    public Majalah (String judul, String penerbit, int tahun, String edisi){
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    @Override
    public String toString() {
        return super.toString() + ", edisi = " + edisi;
    }

    
}
    

