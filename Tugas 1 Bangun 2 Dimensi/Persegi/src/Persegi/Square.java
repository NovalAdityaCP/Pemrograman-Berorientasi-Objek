package Persegi;

public class Square {

public int sisi;

public void setSisi (int sisi){
    this.sisi = sisi;
}

public int getSisi (){
    return this.sisi;
}

public int getLuas(){
    int luas = this.sisi * this.sisi;
    return luas;
}

public int getKeliling(){
    int keliling = this.sisi * 4;
    return keliling;
}

    public static void main(String[] args) {
      Square kotak1 = new Square(); 
      kotak1.setSisi(5);
        System.out.println("Sisi persegi = " + kotak1.getSisi());
        System.out.println("Luas persegi = " + kotak1.getLuas());
        System.out.println("Keliling persegi = " + kotak1.getKeliling());
        
        Square kotak2 = new Square(); 
        kotak2.setSisi(10);
        System.out.println("Sisi persegi = " + kotak2.getSisi());
        System.out.println("Luas persegi = " + kotak2.getLuas());
        System.out.println("Keliling persegi = " + kotak2.getKeliling());
    }
    
}
