package tabung_array;

public class Tabung {
    public double radius;
    public double tinggi;
    public double volume;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
        this.volume = Math.PI * radius * radius * tinggi;
    }

    public void ComputeandSetVolume() {
        this.volume = Math.PI * radius * radius * tinggi;
    }

    public double GetVolume() {
        return volume;
    }

    public static void main(String[] args) {
        double[][] ukuranTabung = {
            {6, 10},
            {7, 12},
            {8, 14},
            {9, 16},
            {10, 18}
        };

        Tabung[] tabungArray = new Tabung[ukuranTabung.length];

        for (int i = 0; i < ukuranTabung.length; i++) {
            tabungArray[i] = new Tabung(ukuranTabung[i][0], ukuranTabung[i][1]);
        }

        for (int i = 0; i < tabungArray.length; i++) {
            System.out.println("Volume dari tabung ke-" + (i + 1) +  " adalah = " + tabungArray[i].GetVolume());
        }

        double totalVolume = 0;
        for (Tabung tabung : tabungArray) {
            totalVolume += tabung.GetVolume();
        }

        double rataRataVolume = totalVolume / tabungArray.length;

        System.out.println("\nTotal Volume dari semua tabung = " + totalVolume);
        System.out.println("Rata-rata Volume dari semua tabung = " + rataRataVolume);
    }
}
