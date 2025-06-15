package balok_array;

public class Balok {

    public double panjang;
    public double lebar;
    public double tinggi;
    public double volume;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.volume = panjang * lebar * tinggi;
    }
    
    public void ComputeandSetVolume() {
        this.volume = panjang * lebar * tinggi;
    }
    
    public double GetVolume() {
        return volume;
    }
    
    public static void main(String[] args) {
        double[][] ukuranBalok = {
            {6, 4, 3}, 
            {7, 5, 4}, 
            {8, 6, 5}, 
            {9, 7, 6}, 
            {10, 8, 7}
        };

        Balok[] balokArray = new Balok[ukuranBalok.length];

        for (int i = 0; i < ukuranBalok.length; i++) {
            balokArray[i] = new Balok(ukuranBalok[i][0], ukuranBalok[i][1], ukuranBalok[i][2]);
        }

        for (int i = 0; i < balokArray.length; i++) {
            System.out.println("Volume dari balok ke-" + (i + 1) + " adalah = " + balokArray[i].GetVolume());
        }

        double totalVolume = 0;
        for (Balok balok : balokArray) {
            totalVolume += balok.GetVolume();
        }

        double rataRataVolume = totalVolume / balokArray.length;

        System.out.println("\nTotal Volume dari semua balok = " + totalVolume);
        System.out.println("Rata-rata Volume dari semua balok = " + rataRataVolume);
    }
}
