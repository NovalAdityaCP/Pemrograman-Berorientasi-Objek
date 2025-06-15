package limassegiempat;

public class LimasSegiEmpat {
    double sisi;
    double tinggi;
    double sisiTegak;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiTegak(double sisiTegak) {
        this.sisiTegak = sisiTegak;
    }

    public double getSisi() {
        return sisi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisiTegak() {
        return sisiTegak;
    }

    public double getVolume() {
        return (sisi * sisi * tinggi) / 3;
    }

    public double getLuasPermukaan() {
        return (sisi * sisi) + (4 * (0.5 * sisi * sisiTegak));
    }

    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        limas1.setSisi(6);
        limas1.setTinggi(10);
        limas1.setSisiTegak(8);

        System.out.println("Sisi alas = " + limas1.getSisi());
        System.out.println("Tinggi limas = " + limas1.getTinggi());
        System.out.println("Sisi tegak = " + limas1.getSisiTegak());
        System.out.println("Volume limas = " + limas1.getVolume());
        System.out.println("Luas permukaan limas = " + limas1.getLuasPermukaan());
}
}