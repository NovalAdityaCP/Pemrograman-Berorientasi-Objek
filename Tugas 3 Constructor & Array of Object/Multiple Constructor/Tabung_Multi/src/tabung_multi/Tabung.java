package tabung_multi;
public class Tabung {

    public double radius;
    public double tinggi;
    public double volume;
    
    public Tabung(){
        
    }
    
    public Tabung (double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
        this.volume = Math.PI * radius * tinggi;
    }
    
    public void SetRadius (double radius){
        this.radius = radius;
    }
    
    public void SetTinggi (double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeandSetVolume (){
        this.volume = Math.PI * radius * tinggi;
    }
    
    public double GetVolume(){
        return volume;
    }
    public static void main(String[] args) {
        Tabung tabung1 = new Tabung (7, 10);
        System.out.println("Volume dari tabung 1 adalah = " + tabung1.GetVolume());
        
        Tabung tabung2 = new Tabung (21, 10);
        System.out.println("Volume dari tabung 1 adalah = " + tabung2.GetVolume());
            
    }
    
}
