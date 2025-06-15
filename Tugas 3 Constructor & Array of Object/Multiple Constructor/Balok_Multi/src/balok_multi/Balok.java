package balok_multi;
public class Balok {
    
public int panjang;
public int lebar;
public int tinggi;
public int volume;

public Balok(){
    
}

public Balok (int panjang, int lebar, int tinggi){
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
    this.volume = this.panjang * this.lebar * this.tinggi;
}

public void setPanjang (int panjang){
    this.panjang = panjang;
}

public void setLebar (int lebar){
    this.lebar = lebar;
}

public void setTinggi (int tinggi){
    this.tinggi = tinggi;
}

public void ComputeAndSetVolume(){
  this.volume = this.panjang *this.lebar * this.tinggi;  
}

public int GetVolume (){
    return this.volume;
}
    public static void main(String[] args) {
        Balok balok1 = new Balok (2,3,4);
        System.out.println("Volume dari Balok 1 adalah = " + balok1.GetVolume());
        
        Balok balok2 = new Balok (6,9,12);
        System.out.println("Volume dari Balok 1 adalah = " + balok2.GetVolume());
    }
    
}
