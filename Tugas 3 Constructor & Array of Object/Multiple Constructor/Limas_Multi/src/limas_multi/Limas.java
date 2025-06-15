package limas_multi;
public class Limas {
    double sisi;
    double tinggi;
    double volume;
    
    public Limas(){
        
    }
    
    public Limas(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.volume = (sisi * sisi * tinggi) / 3;
    }
    
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    
    public void SetTinggi (double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeandSetVolume (){
        this.volume = (sisi * sisi * tinggi) / 3;
    }
    
    public double GetVolume (){
        return volume;
    }
    
    public static void main(String[] args) {
        Limas limas1 = new Limas (6, 10);
        System.out.println("Volume limas 1 adalah = " + limas1.GetVolume());
        
        Limas limas2 = new Limas (9, 15);
        System.out.println("Volume limas 2 adalah = " + limas2.GetVolume());
    }
    
}
