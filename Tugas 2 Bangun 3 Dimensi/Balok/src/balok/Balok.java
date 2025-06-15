package balok;

public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public int getLuasPermukaan() {
        return 2 * ((panjang * tinggi) + (panjang * lebar) + (lebar * tinggi));
    }

    public static void main(String[] args) {
        Balok balok1 = new Balok();
        balok1.setPanjang(5);
        balok1.setLebar(4);
        balok1.setTinggi(10);

        System.out.println("Panjang balok = " + balok1.getPanjang());
        System.out.println("Lebar balok = " + balok1.getLebar());
        System.out.println("Tinggi balok = " + balok1.getTinggi());
        System.out.println("Volume balok = " + balok1.getVolume());
        System.out.println("Luas permukaan balok = " + balok1.getLuasPermukaan());

        
    }
}
