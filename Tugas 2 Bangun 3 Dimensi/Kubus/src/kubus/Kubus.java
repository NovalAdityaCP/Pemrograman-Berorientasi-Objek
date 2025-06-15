package kubus;

public class Kubus {

    public int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return this.sisi;
    }

    public int getVolume() {
        return this.sisi * this.sisi * this.sisi;
    }

    public int getLuasPermukaan() {
        return 6 * (this.sisi * this.sisi);
    }

    public static void main(String[] args) {
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(10);
        System.out.println("Sisi kubus = " + kubus1.getSisi());
        System.out.println("Volume kubus = " + kubus1.getVolume());
        System.out.println("Luas permukaan kubus = " + kubus1.getLuasPermukaan());

       
    }
}
