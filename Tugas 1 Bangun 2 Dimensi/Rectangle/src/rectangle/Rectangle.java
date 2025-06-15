package rectangle;

public class Rectangle {
int panjang;
int lebar;

public void setPanjang (int panjang){
    this.panjang = panjang;
}

public void setLebar (int lebar){
    this.lebar = lebar;
}

public int getPanjang (){
    return this.panjang;
}

public int getLebar (){
    return this.lebar;
}

public int getLuas(){
    int luas = this.panjang * this.lebar;
    return luas;
}

public int getKeliling(){
    int keliling = (this.panjang + this.lebar) * 2;
    return keliling;
}
    public static void main(String[] args) {
      Rectangle persegipanjang = new Rectangle(); 
      persegipanjang.setPanjang(10);
      persegipanjang.setLebar(5);
      System.out.println("Panjang persegi panjang = " +  persegipanjang.getPanjang());
      System.out.println("Lebar persegi panjang = " +  persegipanjang.getLebar());
      System.out.println("Luas persegi panjang = " +  persegipanjang.getLuas());
      System.out.println("Keliling persegi panjang = " +  persegipanjang.getKeliling());
    }
    
}
