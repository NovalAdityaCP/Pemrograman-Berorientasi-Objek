package kubus_array;
public class Kubus {

    public double sisi;
    public double volume;
    
    public Kubus (double sisi){
        this.sisi = sisi;
        this.volume = sisi * sisi * sisi;
    }
    
    public void ComputeandSetVolume (){
        this.volume = sisi * sisi * sisi;
    }
    
    public double GetVolume (){
        return volume;
    }
    
    public static void main(String[] args) {
        double[] sisiKubus = {6, 7, 8, 9, 10};

        Kubus[] kubusArray = new Kubus[sisiKubus.length];

        for (int i = 0; i < sisiKubus.length; i++) {
            kubusArray[i] = new Kubus(sisiKubus[i]); 
        }

        for (int i = 0; i < kubusArray.length; i++) {
            System.out.println("Volume dari kubus ke-" + (i + 1) + " dengan sisi " + sisiKubus[i] + " adalah = " + kubusArray[i].GetVolume());
        }
        double totalVolume = 0;
        for (Kubus kubus : kubusArray) {
            totalVolume += kubus.GetVolume();
        }

        double rataRataVolume = totalVolume / kubusArray.length;

        System.out.println("\nTotal Volume dari semua kubus = " + totalVolume);
        System.out.println("Rata-rata Volume dari semua kubus = " +  rataRataVolume);
    }
}