package ellipse;
public class Ellipse {
    double semiMajorAxis;
    double semiMinorAxis;
    double phi = 3.14;
    
    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }
    
    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }
    
    public double getSemiMajorAxis() {
        return this.semiMajorAxis;
    }
    
    public double getSemiMinorAxis() {
        return this.semiMinorAxis;
    }
    
    public double getLuas() {
        return phi * this.semiMajorAxis * this.semiMinorAxis;
    }
    
    public double getKeliling() {
        return phi * (3 * (this.semiMajorAxis + this.semiMinorAxis) - Math.sqrt((3 * this.semiMajorAxis + this.semiMinorAxis) * (this.semiMajorAxis + 3 * this.semiMinorAxis)));
    }
    
    public static void main(String[] args) {
        Ellipse oval = new Ellipse();
        oval.setSemiMajorAxis(10);
        oval.setSemiMinorAxis(5);
 
        System.out.println("Sumbu semi-mayor = " + oval.getSemiMajorAxis());
        System.out.println("Sumbu semi-minor = " + oval.getSemiMinorAxis());
        System.out.println("Luas oval = " + oval.getLuas());
        System.out.println("Keliling oval = " + oval.getKeliling());
    }
}

