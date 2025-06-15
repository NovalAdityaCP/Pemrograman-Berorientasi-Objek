package bola;

public class Bola {
    double jari;
    double phi = 3.14;

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public double getVolume() {
        return (4.0 / 3.0) * phi * jari * jari * jari;
    }

    public double getLuasPermukaan() {
        return 4 * phi * jari * jari;
    }

    public static void main(String[] args) {
        Bola bola1 = new Bola();
        bola1.setJari(14);

        System.out.println("Jari-jari bola = " + bola1.getJari());
        System.out.println("Volume bola = " + bola1.getVolume());
        System.out.println("Luas permukaan bola = " + bola1.getLuasPermukaan());
    }
}
