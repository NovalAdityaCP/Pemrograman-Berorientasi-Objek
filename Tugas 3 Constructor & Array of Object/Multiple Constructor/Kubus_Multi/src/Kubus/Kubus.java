package Kubus;

public class Kubus {
public int sisi;
public int volume;

public Kubus (){
    
}

public Kubus (int sisi){
    this.sisi = sisi;
    this.volume = this.sisi * this.sisi * this.sisi;
}

public void Setsisi (int sisi){
    this.sisi = sisi;
}

public void ComputeAndSetVolume (){
    this.volume = this.sisi * this.sisi * this.sisi;
  }

public int GetVolume (){
    return this.volume;
}
    public static void main(String[] args) {
        Kubus kotak1 = new Kubus (6);
        System.out.println("Volume dari kubus 1 adalah = " + kotak1.GetVolume());
        
        Kubus kotak2 = new Kubus (10);
        System.out.println("Volume dari kubus 2 adalah = " + kotak2.GetVolume());
    }
    
}
