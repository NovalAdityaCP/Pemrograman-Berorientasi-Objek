package limas_array;

public class Limas {
    public double sisi;
    public double tinggi;
    public double volume;

    public Limas(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.volume = (sisi * sisi * tinggi) / 3;
    }

    public void ComputeandSetVolume() {
        this.volume = (sisi * sisi * tinggi) / 3;
    }

    public double GetVolume() {
        return volume;
    }

    public static void main(String[] args) {
        double[][] ukuranLimas = {
            {6, 10},
            {7, 12},
            {8, 14},
            {9, 16},
            {10, 18}
        };

        Limas[] limasArray = new Limas[ukuranLimas.length];

        for (int i = 0; i < ukuranLimas.length; i++) {
            limasArray[i] = new Limas(ukuranLimas[i][0], ukuranLimas[i][1]);
        }

        for (int i = 0; i < limasArray.length; i++) {
            System.out.println("Volume dari limas ke-" + (i + 1) + " adalah = " + limasArray[i].GetVolume());
        }

        double totalVolume = 0;
        for (Limas limas : limasArray) {
            totalVolume += limas.GetVolume();
        }

        double rataRataVolume = totalVolume / limasArray.length;

        System.out.println("\nTotal Volume dari semua limas = " + totalVolume);
        System.out.println("Rata-rata Volume dari semua limas = " + rataRataVolume);
    }
}
