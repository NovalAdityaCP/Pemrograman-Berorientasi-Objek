package bola_array;

public class Bola {
    public double radius;
    public double volume;

    public Bola (double radius) {
        this.radius = radius;
        this.volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public void ComputeandSetVolume() {
        this.volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public double GetVolume() {
        return volume;
    }

    public static void main(String[] args) {
        double[] radiusBola = {6, 7, 8, 9, 10};

        Bola[] bolaArray = new Bola[radiusBola.length];

        for (int i = 0; i < radiusBola.length; i++) {
            bolaArray[i] = new Bola(radiusBola[i]);
        }

        for (int i = 0; i < bolaArray.length; i++) {
            System.out.println("Volume dari bola ke-" + (i + 1) + " dengan radius "
                    + radiusBola[i] + " adalah = " + bolaArray[i].GetVolume());
        }

        double totalVolume = 0;
        for (Bola bola : bolaArray) {
            totalVolume += bola.GetVolume();
        }

        double rataRataVolume = totalVolume / bolaArray.length;

        System.out.println("\nTotal Volume dari semua bola = " + totalVolume);
        System.out.println("Rata-rata Volume dari semua bola = " + rataRataVolume);
    }
}
