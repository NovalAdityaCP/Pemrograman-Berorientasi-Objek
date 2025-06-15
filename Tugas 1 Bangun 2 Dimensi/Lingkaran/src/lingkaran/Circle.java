package lingkaran;


public class Circle {
double phi = 3.14;
double jari;

public void setJari(double jari){
    this.jari = jari;
}

public double getJari(){
    return this.jari;
}

public double getLuas(){
    return phi * this.jari * this.jari;
}

public double getKeliling(){
    return phi * this.jari * 2;
}
public static void main(String[] args) {
    Circle lingkaran = new Circle();
    lingkaran.setJari(14);
    System.out.println("Jari-jari = " + lingkaran.getJari());
    System.out.println("Luas = " + lingkaran.getLuas());
    System.out.println("Keliling = " + lingkaran.getKeliling());
    
}
}
