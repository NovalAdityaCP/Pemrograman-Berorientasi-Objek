package tabung;

public class Tabung {
    double jari;
    double tinggi;
    double phi = 3.14;

    public void setJari(double jari) {
        this.jari = jari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJari() {
        return jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return phi * jari * jari * tinggi;
    }

    public double getLuasPermukaan() {
        return 2 * phi * jari * (jari + tinggi);
    }

    public static void main(String[] args) {
        Tabung tabung1 = new Tabung();
        tabung1.setJari(7);
        tabung1.setTinggi(10);

        System.out.println("Jari-jari tabung = " + tabung1.getJari());
        System.out.println("Tinggi tabung = " + tabung1.getTinggi());
        System.out.println("Volume tabung = " + tabung1.getVolume());
        System.out.println("Luas permukaan tabung = " + tabung1.getLuasPermukaan());
    }
}
