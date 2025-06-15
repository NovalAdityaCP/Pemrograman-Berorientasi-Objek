package bola_multi;
public class Bola {

    public double radius;
    public double volume;
    
    public Bola(){
        
    }
    
    public Bola(double radius){
        this.radius = radius;
        this.volume = (4.0/3.0) * Math.PI * radius * radius * radius;
    }
    
    public void SetRadius(double radius){
        this.radius = radius;
    }
    
    public void ComputeandSetVolume(){
        this.volume = (4.0/3.0) * Math.PI * radius * radius * radius;
    }
    
    public double GetVolume(){
        return this.volume;
    }
    
    public static void main(String[] args) {
        Bola bola1 = new Bola(7);
        System.out.println("Volume dari bola 1 adalah = " + bola1.GetVolume());
        
        Bola bola2 = new Bola(14);
        System.out.println("Volume dari bola 2 adalah = " + bola2.GetVolume());
    }
    
}
